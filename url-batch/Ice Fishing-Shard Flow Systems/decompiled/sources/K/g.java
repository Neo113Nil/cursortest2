package K;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class g implements h {

    /* renamed from: d, reason: collision with root package name */
    public final InputContentInfo f1419d;

    public g(Object obj) {
        this.f1419d = (InputContentInfo) obj;
    }

    @Override // K.h
    public final ClipDescription getDescription() {
        return this.f1419d.getDescription();
    }

    @Override // K.h
    public final Object l() {
        return this.f1419d;
    }

    @Override // K.h
    public final Uri m() {
        return this.f1419d.getContentUri();
    }

    @Override // K.h
    public final void n() {
        this.f1419d.requestPermission();
    }

    @Override // K.h
    public final Uri p() {
        return this.f1419d.getLinkUri();
    }

    public g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f1419d = new InputContentInfo(uri, clipDescription, uri2);
    }
}
