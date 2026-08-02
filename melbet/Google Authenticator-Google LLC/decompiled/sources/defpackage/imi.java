package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imi {
    public static jll a(ProtoParsers$InternalDontUse protoParsers$InternalDontUse, jll jllVar, jkd jkdVar) {
        return protoParsers$InternalDontUse.b(jllVar.s(), jkdVar);
    }

    public static jll b(Bundle bundle, String str, jll jllVar, jkd jkdVar) {
        ProtoParsers$InternalDontUse protoParsers$InternalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(ProtoParsers$InternalDontUse.class.getClassLoader());
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            protoParsers$InternalDontUse = (ProtoParsers$InternalDontUse) parcelable;
        }
        return a(protoParsers$InternalDontUse, jllVar, jkdVar);
    }

    public static jll c(Bundle bundle, String str, jll jllVar, jkd jkdVar) {
        try {
            return b(bundle, str, jllVar, jkdVar);
        } catch (jld e) {
            throw new RuntimeException(e);
        }
    }

    public static void d(Bundle bundle, String str, jll jllVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new ProtoParsers$InternalDontUse(null, jllVar));
        bundle.putParcelable(str, bundle2);
    }
}
