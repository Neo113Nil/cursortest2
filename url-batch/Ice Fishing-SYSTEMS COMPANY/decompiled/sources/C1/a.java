package C1;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import g1.C4524d;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371a;

    public /* synthetic */ a(int i) {
        this.f371a = i;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f371a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final f b(Object obj) {
        switch (this.f371a) {
            case 0:
                return new C4524d(3, (ByteBuffer) obj);
            case 1:
                return new g(obj);
            default:
                return new g((ParcelFileDescriptor) obj);
        }
    }
}
