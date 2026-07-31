package com.yandex.div.core.view2.errors;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.errors.VariableMonitorView;
import com.yandex.div.data.Variable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class VariableMonitorView extends LinearLayout {

    @NotNull
    private final Context context;

    @NotNull
    private final LinearLayout title;

    @NotNull
    private final VariableAdapter variablesAdapter;

    @Metadata
    /* renamed from: com.yandex.div.core.view2.errors.VariableMonitorView$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends p implements Function1<List<? extends Pair<? extends String, ? extends Variable>>, Unit> {
        AnonymousClass1(Object obj) {
            super(1, obj, VariableMonitorView.class, "updateTable", "updateTable(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((List<? extends Pair<String, ? extends Variable>>) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull List<? extends Pair<String, ? extends Variable>> p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((VariableMonitorView) this.receiver).updateTable(p02);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VariableMonitorView(@NotNull Context context, @NotNull VariableMonitor variableMonitor) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(variableMonitor, "variableMonitor");
        this.context = context;
        this.variablesAdapter = new VariableAdapter(new VariableMonitorView$variablesAdapter$1(variableMonitor));
        LinearLayout createTableTitle = createTableTitle();
        this.title = createTableTitle;
        setOrientation(1);
        variableMonitor.setVariablesUpdatedCallback(new AnonymousClass1(this));
        addView(createTableTitle, new LinearLayout.LayoutParams(-1, -2));
        addView(createTable(), new LinearLayout.LayoutParams(-1, -2));
    }

    private final TextView createCellTitle(String str) {
        TextView textView = new TextView(this.context);
        DisplayMetrics displayMetrics = textView.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
        int dpToPx = BaseDivViewExtensionsKt.dpToPx(8, displayMetrics);
        textView.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        textView.setTextColor(-1);
        textView.setText(str);
        textView.setTypeface(textView.getTypeface(), 1);
        return textView;
    }

    private final RecyclerView createTable() {
        RecyclerView recyclerView = new RecyclerView(this.context);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.variablesAdapter);
        recyclerView.setBackgroundColor(Color.argb(50, 0, 0, 0));
        return recyclerView;
    }

    private final LinearLayout createTableTitle() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        List listOf = CollectionsKt.listOf((Object[]) new Integer[]{200, 60, 100});
        List listOf2 = CollectionsKt.listOf((Object[]) new String[]{"name", "type", "value"});
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listOf2, 10));
        Iterator it = listOf2.iterator();
        while (it.hasNext()) {
            arrayList.add(createCellTitle((String) it.next()));
        }
        for (Pair pair : CollectionsKt.zip(arrayList, listOf)) {
            TextView textView = (TextView) pair.component1();
            Integer valueOf = Integer.valueOf(((Number) pair.component2()).intValue());
            DisplayMetrics displayMetrics = linearLayout.getResources().getDisplayMetrics();
            Intrinsics.checkNotNullExpressionValue(displayMetrics, "resources.displayMetrics");
            linearLayout.addView(textView, new LinearLayout.LayoutParams(BaseDivViewExtensionsKt.dpToPx(valueOf, displayMetrics), -2));
        }
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTable(List<? extends Pair<String, ? extends Variable>> list) {
        VariableModel model;
        VariableAdapter variableAdapter = this.variablesAdapter;
        List<? extends Pair<String, ? extends Variable>> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            model = VariableMonitorViewKt.toModel((Variable) pair.component2(), (String) pair.component1());
            arrayList.add(model);
        }
        variableAdapter.submitList(arrayList, new Runnable() { // from class: A1.d
            @Override // java.lang.Runnable
            public final void run() {
                VariableMonitorView.updateTable$lambda$5(VariableMonitorView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateTable$lambda$5(VariableMonitorView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.title.setVisibility(this$0.variablesAdapter.getItemCount() != 0 ? 0 : 8);
    }
}
