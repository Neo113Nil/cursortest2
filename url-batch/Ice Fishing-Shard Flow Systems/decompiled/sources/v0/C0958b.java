package v0;

import android.os.Build;

/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0958b extends AbstractC0959c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0958b(int i2, String str, String str2) {
        super(str, str2);
        this.f8186d = i2;
    }

    @Override // v0.AbstractC0959c
    public final boolean a() {
        switch (this.f8186d) {
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
