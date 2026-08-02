package b0;

import android.os.Build;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0171b extends AbstractC0172c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2522d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0171b(String str, String str2, int i3) {
        super(str, str2);
        this.f2522d = i3;
    }

    @Override // b0.AbstractC0172c
    public final boolean a() {
        switch (this.f2522d) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return false;
            case 3:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
