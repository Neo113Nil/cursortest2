package p3;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public final class l extends UnsupportedOperationException {

    /* renamed from: f, reason: collision with root package name */
    private final o3.d f20132f;

    public l(@RecentlyNonNull o3.d dVar) {
        this.f20132f = dVar;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public String getMessage() {
        String valueOf = String.valueOf(this.f20132f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
