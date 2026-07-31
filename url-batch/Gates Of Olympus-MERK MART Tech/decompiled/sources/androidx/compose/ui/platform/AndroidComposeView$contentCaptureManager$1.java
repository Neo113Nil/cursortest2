package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements Function0<ContentCaptureSessionWrapper> {
    AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ContentCaptureSessionWrapper invoke() {
        ContentCaptureSessionWrapper contentCaptureSessionCompat;
        contentCaptureSessionCompat = AndroidComposeView_androidKt.getContentCaptureSessionCompat((View) this.receiver);
        return contentCaptureSessionCompat;
    }
}
