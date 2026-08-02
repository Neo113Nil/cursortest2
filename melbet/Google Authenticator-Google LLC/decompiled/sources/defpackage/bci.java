package defpackage;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bci implements bbw {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public bci(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public static boolean d() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // defpackage.bbw
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }

    @Override // defpackage.bbw
    public final void b() {
    }
}
