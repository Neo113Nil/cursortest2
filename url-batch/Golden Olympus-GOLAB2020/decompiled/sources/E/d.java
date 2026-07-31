package E;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final b f491a;

    private static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final InputContentInfo f492a;

        a(Object obj) {
            this.f492a = (InputContentInfo) obj;
        }

        @Override // E.d.b
        public Uri a() {
            return this.f492a.getContentUri();
        }

        @Override // E.d.b
        public void b() {
            this.f492a.requestPermission();
        }

        @Override // E.d.b
        public Uri c() {
            return this.f492a.getLinkUri();
        }

        @Override // E.d.b
        public Object d() {
            return this.f492a;
        }

        @Override // E.d.b
        public ClipDescription getDescription() {
            return this.f492a.getDescription();
        }
    }

    private interface b {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    private d(b bVar) {
        this.f491a = bVar;
    }

    public static d f(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(new a(obj));
    }

    public Uri a() {
        return this.f491a.a();
    }

    public ClipDescription b() {
        return this.f491a.getDescription();
    }

    public Uri c() {
        return this.f491a.c();
    }

    public void d() {
        this.f491a.b();
    }

    public Object e() {
        return this.f491a.d();
    }
}
