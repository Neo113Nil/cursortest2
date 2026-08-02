package j0;

import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements v {

    /* renamed from: a, reason: collision with root package name */
    public static final j f13763a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final j f13764b = new j();

    @Override // j0.v
    public int a(Object obj) {
        String str = ((o) obj).f13766a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    public List b(String str, boolean z, boolean z4) {
        return w.e(str, z, z4);
    }
}
