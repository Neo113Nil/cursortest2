package s3;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f6699a;

    public f(Object obj) {
        this.f6699a = (InputContentInfo) obj;
    }

    @Override // s3.g
    public final ClipDescription a() {
        return this.f6699a.getDescription();
    }

    @Override // s3.g
    public final Object b() {
        return this.f6699a;
    }

    @Override // s3.g
    public final Uri c() {
        return this.f6699a.getContentUri();
    }

    @Override // s3.g
    public final void d() {
        this.f6699a.requestPermission();
    }

    @Override // s3.g
    public final Uri e() {
        return this.f6699a.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6699a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
