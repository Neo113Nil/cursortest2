package y1;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<Uri, byte[]> f23254a;

    class a extends LinkedHashMap<Uri, byte[]> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f23255f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e eVar, int i7, float f7, boolean z6, int i8) {
            super(i7, f7, z6);
            this.f23255f = i8;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.f23255f;
        }
    }

    public e(int i7) {
        this.f23254a = new a(this, i7 + 1, 1.0f, false, i7);
    }

    public byte[] a(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.f23254a.get(uri);
    }

    public byte[] b(Uri uri, byte[] bArr) {
        return this.f23254a.put((Uri) o2.a.e(uri), (byte[]) o2.a.e(bArr));
    }

    public byte[] c(Uri uri) {
        return this.f23254a.remove(o2.a.e(uri));
    }
}
