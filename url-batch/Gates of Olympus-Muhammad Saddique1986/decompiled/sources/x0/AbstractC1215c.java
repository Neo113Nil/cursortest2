package x0;

import android.view.ViewStructure;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: x0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1215c {
    public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
        contentCaptureSession.notifyViewsAppeared(list);
    }
}
