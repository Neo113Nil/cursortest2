package t1;

import android.os.Build;

/* renamed from: t1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1438b extends AbstractC1439c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1438b(String str, String str2, int i4) {
        super(str, str2);
        this.f15390d = i4;
    }

    @Override // t1.AbstractC1439c
    public final boolean a() {
        switch (this.f15390d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                }
                break;
            case 5:
                if (Build.VERSION.SDK_INT >= 27) {
                }
                break;
            case 6:
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438b(String str) {
        super("IMPLEMENTATION_ONLY_FEATURE", str);
        this.f15390d = 3;
    }
}
