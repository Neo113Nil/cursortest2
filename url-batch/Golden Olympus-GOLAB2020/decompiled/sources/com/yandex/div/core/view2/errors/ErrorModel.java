package com.yandex.div.core.view2.errors;

import O1.C1165z4;
import W1.AbstractC1233c;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.util.DisplayMetrics;
import android.widget.Toast;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.expression.ExpressionsRuntime;
import com.yandex.div.core.expression.local.RuntimeStore;
import com.yandex.div.core.expression.variables.VariableController;
import com.yandex.div.core.view2.Binding;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.ErrorModel;
import com.yandex.div.data.Variable;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.util.JsonNode;
import com.yandex.div.json.ParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata
/* loaded from: classes2.dex */
public final class ErrorModel {

    @NotNull
    private final List<Throwable> currentErrors;

    @NotNull
    private final List<Throwable> currentWarnings;

    @NotNull
    private final Div2View div2View;

    @NotNull
    private final ErrorCollectors errorCollectors;

    @Nullable
    private Disposable existingSubscription;

    @NotNull
    private final Set<Function1<ErrorViewModel, Unit>> observers;

    @NotNull
    private ErrorViewModel state;

    @NotNull
    private final Function2<List<? extends Throwable>, List<? extends Throwable>, Unit> updateOnErrors;
    private final boolean visualErrorsEnabled;

    public ErrorModel(@NotNull ErrorCollectors errorCollectors, @NotNull Div2View div2View, boolean z4) {
        Intrinsics.checkNotNullParameter(errorCollectors, "errorCollectors");
        Intrinsics.checkNotNullParameter(div2View, "div2View");
        this.errorCollectors = errorCollectors;
        this.div2View = div2View;
        this.visualErrorsEnabled = z4;
        this.observers = new LinkedHashSet();
        this.currentErrors = new ArrayList();
        this.currentWarnings = new ArrayList();
        this.updateOnErrors = new ErrorModel$updateOnErrors$1(this);
        this.state = new ErrorViewModel(false, 0, 0, null, null, 31, null);
    }

    private final JSONObject dumpCardWithContextVariables() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templates", new JSONObject());
        C1165z4 divData = this.div2View.getDivData();
        jSONObject.put("card", divData != null ? divData.writeToJSON() : null);
        jSONObject.put("variables", dumpGlobalVariables());
        return jSONObject;
    }

    private final JSONArray dumpGlobalVariables() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.div2View.getDiv2Component$div_release().getDivVariableController().captureAllVariables().iterator();
        while (it.hasNext()) {
            jSONArray.put(((Variable) it.next()).writeToJSON());
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String errorsToDetails(List<? extends Throwable> list) {
        return "Last 25 errors:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(list, 25), "\n", null, null, 0, null, ErrorModel$errorsToDetails$errorsList$1.INSTANCE, 30, null);
    }

    public static /* synthetic */ String generateReport$default(ErrorModel errorModel, boolean z4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        return errorModel.generateReport(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeAndGet$lambda$0(ErrorModel this$0, Function1 observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        this$0.observers.remove(observer);
    }

    /* renamed from: pasteToClipBoard-IoAF18A, reason: not valid java name */
    private final Object m160pasteToClipBoardIoAF18A(String str) {
        Div2Context context$div_release = this.div2View.getContext$div_release();
        Object systemService = context$div_release.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null) {
            Assert.fail("Failed to access clipboard manager!");
            Result.Companion companion = Result.Companion;
            return Result.m243constructorimpl(Unit.f41027a);
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(str)));
            Toast.makeText(context$div_release, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            Result.Companion companion2 = Result.Companion;
            return Result.m243constructorimpl(Unit.f41027a);
        } catch (Exception e4) {
            Result.Companion companion3 = Result.Companion;
            return Result.m243constructorimpl(ResultKt.createFailure(new RuntimeException("Failed paste report to clipboard!", e4)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(ErrorViewModel errorViewModel) {
        this.state = errorViewModel;
        Iterator<T> it = this.observers.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(errorViewModel);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String warningsToDetails(List<? extends Throwable> list) {
        return "Last 25 warnings:\n" + CollectionsKt.joinToString$default(CollectionsKt.take(list, 25), "\n", null, null, 0, null, ErrorModel$warningsToDetails$warningsList$1.INSTANCE, 30, null);
    }

    public final void bind(@NotNull Binding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Disposable disposable = this.existingSubscription;
        if (disposable != null) {
            disposable.close();
        }
        this.existingSubscription = this.errorCollectors.getOrCreate(binding.getTag(), binding.getData()).observeAndGet(this.updateOnErrors);
    }

    public final void copyReportToClipboard() {
        boolean causedByTransactionTooLargeException;
        Throwable d4 = Result.d(m160pasteToClipBoardIoAF18A(generateReport$default(this, false, 1, null)));
        if (d4 != null) {
            causedByTransactionTooLargeException = ErrorVisualMonitorKt.causedByTransactionTooLargeException(d4);
            if (causedByTransactionTooLargeException) {
                m160pasteToClipBoardIoAF18A(generateReport(false));
            }
        }
    }

    @NotNull
    public final String generateReport(boolean z4) {
        String fullStackMessage;
        JSONObject jSONObject = new JSONObject();
        if (this.currentErrors.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (Throwable th : this.currentErrors) {
                JSONObject jSONObject2 = new JSONObject();
                fullStackMessage = ErrorVisualMonitorKt.getFullStackMessage(th);
                jSONObject2.put(CrashHianalyticsData.MESSAGE, fullStackMessage);
                jSONObject2.put("stacktrace", AbstractC1233c.b(th));
                if (th instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th;
                    jSONObject2.put("reason", parsingException.getReason());
                    JsonNode source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.dump() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (this.currentWarnings.size() > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (Throwable th2 : this.currentWarnings) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", AbstractC1233c.b(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z4) {
            jSONObject.put("card", dumpCardWithContextVariables());
        }
        String jSONObject4 = jSONObject.toString(4);
        Intrinsics.checkNotNullExpressionValue(jSONObject4, "results.toString(/*indentSpaces*/ 4)");
        return jSONObject4;
    }

    @NotNull
    public final Map<String, VariableController> getAllControllers() {
        RuntimeStore runtimeStore$div_release = this.div2View.getRuntimeStore$div_release();
        if (runtimeStore$div_release == null) {
            return MapsKt.emptyMap();
        }
        Map<String, ExpressionsRuntime> uniquePathsAndRuntimes$div_release = runtimeStore$div_release.getUniquePathsAndRuntimes$div_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ExpressionsRuntime rootRuntime = runtimeStore$div_release.getRootRuntime();
        if (rootRuntime != null) {
            linkedHashMap.put("", rootRuntime.getVariableController());
        }
        for (Map.Entry<String, ExpressionsRuntime> entry : uniquePathsAndRuntimes$div_release.entrySet()) {
            linkedHashMap.put(entry.getKey(), entry.getValue().getVariableController());
        }
        return linkedHashMap;
    }

    @NotNull
    public final Function1<Throwable, Unit> getErrorHandler() {
        return new ErrorModel$getErrorHandler$1(this.div2View);
    }

    public final void hideDetails() {
        setState(ErrorViewModel.copy$default(this.state, false, 0, 0, null, null, 30, null));
    }

    @NotNull
    public final Disposable observeAndGet(@NotNull final Function1<? super ErrorViewModel, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
        observer.invoke(this.state);
        return new Disposable() { // from class: A1.b
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                ErrorModel.observeAndGet$lambda$0(ErrorModel.this, observer);
            }
        };
    }

    public final void onCounterClick(int i4, int i5) {
        Integer valueOf = Integer.valueOf(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED);
        DisplayMetrics displayMetrics = this.div2View.getContext$div_release().getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "div2View.context.resources.displayMetrics");
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(valueOf, displayMetrics);
        if (i4 < dpToPx || i5 < dpToPx) {
            copyReportToClipboard();
        } else {
            showDetails();
        }
    }

    public final void showDetails() {
        setState(ErrorViewModel.copy$default(this.state, true, 0, 0, null, null, 30, null));
    }
}
