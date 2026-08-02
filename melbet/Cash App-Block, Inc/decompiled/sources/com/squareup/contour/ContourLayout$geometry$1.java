package com.squareup.contour;

import android.graphics.Rect;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.input.nestedscroll.NestedScrollNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.ComposeViewContext;
import androidx.compose.ui.platform.DerivedSize;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.IntSize;
import androidx.datastore.core.FileStorage;
import androidx.datastore.core.SimpleActor;
import com.datadog.android.core.InternalSdkCore;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.MutableParametersRegistry;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ContourLayout$geometry$1 extends Lambda implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContourLayout$geometry$1(Object obj, int i) {
        super(0);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Parameters parameters;
        switch (this.$r8$classId) {
            case 0:
                ContourLayout contourLayout = (ContourLayout) this.this$0;
                return contourLayout.respectPadding ? new Rect(contourLayout.getPaddingLeft(), contourLayout.getPaddingTop(), contourLayout.getPaddingRight(), contourLayout.getPaddingBottom()) : new Rect(0, 0, 0, 0);
            case 1:
                ((FocusTargetNode) this.this$0).fetchFocusProperties$ui();
                return Unit.INSTANCE;
            case 2:
                VectorPainter vectorPainter = (VectorPainter) this.this$0;
                Unit unit = Unit.INSTANCE;
                vectorPainter.drawInvalidation$delegate.setValue(unit);
                return unit;
            case 3:
                return (CoroutineScope) ((SimpleActor) this.this$0).scope;
            case 4:
                return ((NestedScrollNode) this.this$0).getNestedCoroutineScope();
            case 5:
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = ((LayoutNode) this.this$0).layoutDelegate;
                layoutNodeLayoutDelegate.measurePassDelegate.childDelegatesDirty = true;
                LookaheadPassDelegate lookaheadPassDelegate = layoutNodeLayoutDelegate.lookaheadPassDelegate;
                if (lookaheadPassDelegate != null) {
                    lookaheadPassDelegate.childDelegatesDirty = true;
                }
                return Unit.INSTANCE;
            case 6:
                JobKt.cancel(((AndroidPlatformTextInputSession) this.this$0).coroutineScope, (CancellationException) null);
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                ComposeViewContext composeViewContext = (ComposeViewContext) this.this$0;
                boolean m1055equalsimpl0 = IntSize.m1055equalsimpl0(0L, 0L);
                View view = composeViewContext.view;
                return m1055equalsimpl0 ? zzagj.calculateWindowSize(view) : DerivedSize.Companion.m928fromPxSizeviCIZxY(Strings.Density(view.getContext()));
            case 9:
                RectManager rectManager = (RectManager) this.this$0;
                rectManager.dispatchToken = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rectManager.dispatchCallbacks();
                    Trace.endSection();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 10:
                Object systemService = ((AndroidComposeView) ((GrpcMethod) this.this$0).path).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 11:
                return new BaseInputConnection(((TextInputServiceAndroid) this.this$0).view, false);
            case 12:
                return (androidx.compose.ui.geometry.Rect) this.this$0;
            case 13:
                Object obj = FileStorage.activeFilesLock;
                File file = (File) this.this$0;
                synchronized (obj) {
                    FileStorage.activeFiles.remove(file.getAbsolutePath());
                }
                return Unit.INSTANCE;
            case 14:
                File file2 = (File) ((Function0) this.this$0).invoke();
                if (!FilesKt__UtilsKt.getExtension(file2).equals("preferences_pb")) {
                    Handlers$$ExternalSyntheticBUOutline0.m("File extension for file: ", file2, " does not match required extension for Preferences file: preferences_pb");
                    return null;
                }
                File absoluteFile = file2.getAbsoluteFile();
                absoluteFile.getClass();
                return absoluteFile;
            case 15:
                return String.format(Locale.US, "No RumMonitor for the SDK instance with name %s found, returning no-op implementation.", Arrays.copyOf(new Object[]{((InternalSdkCore) this.this$0).getName()}, 1));
            default:
                ((EllipticCurveEncryptionEngine) this.this$0).register();
                MutableParametersRegistry mutableParametersRegistry = MutableParametersRegistry.globalInstance;
                synchronized (mutableParametersRegistry) {
                    if (!mutableParametersRegistry.parametersMap.containsKey("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM")) {
                        throw new GeneralSecurityException("Name ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM does not exist");
                    }
                    parameters = (Parameters) mutableParametersRegistry.parametersMap.get("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM");
                }
                return new KeyTemplate(parameters);
        }
    }
}
