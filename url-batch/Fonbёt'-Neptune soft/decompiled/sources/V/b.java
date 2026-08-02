package V;

import android.os.Build;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1096d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, String str, String str2) {
        super(str, str2);
        this.f1096d = i2;
    }

    @Override // V.c
    public final boolean a() {
        switch (this.f1096d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 23) {
                }
                break;
            case 1:
                if (Build.VERSION.SDK_INT >= 24) {
                }
                break;
            case 2:
                break;
            case 3:
                if (Build.VERSION.SDK_INT >= 26) {
                }
                break;
            case K.k.LONG_FIELD_NUMBER /* 4 */:
                if (Build.VERSION.SDK_INT >= 27) {
                }
                break;
            case K.k.STRING_FIELD_NUMBER /* 5 */:
                if (Build.VERSION.SDK_INT >= 28) {
                }
                break;
            default:
                if (Build.VERSION.SDK_INT >= 29) {
                }
                break;
        }
        return false;
    }
}
