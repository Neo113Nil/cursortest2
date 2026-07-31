package r0;

import android.os.Build;
import com.onesignal.core.internal.permissions.h;
import com.onesignal.inAppMessages.internal.display.impl.a;
import kotlin.jvm.internal.i;
import q0.C0593a;
import s0.AbstractC0627e;
import u0.C0686p;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609a extends AbstractC0610b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5840f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0609a(AbstractC0627e abstractC0627e, int i7) {
        super(abstractC0627e);
        this.f5840f = i7;
    }

    @Override // r0.AbstractC0610b
    public final boolean a(C0686p workSpec) {
        switch (this.f5840f) {
            case 0:
                i.e(workSpec, "workSpec");
                return workSpec.f6009j.f5256b;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                i.e(workSpec, "workSpec");
                return workSpec.f6009j.f5258d;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                i.e(workSpec, "workSpec");
                return workSpec.f6009j.f5255a == 2;
            case 3:
                i.e(workSpec, "workSpec");
                int i7 = workSpec.f6009j.f5255a;
                return i7 == 3 || (Build.VERSION.SDK_INT >= 30 && i7 == 6);
            default:
                i.e(workSpec, "workSpec");
                return workSpec.f6009j.f5259e;
        }
    }

    @Override // r0.AbstractC0610b
    public final boolean b(Object obj) {
        boolean booleanValue;
        switch (this.f5840f) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                C0593a value = (C0593a) obj;
                i.e(value, "value");
                boolean z5 = value.f5749a;
                return Build.VERSION.SDK_INT < 26 ? !z5 : !(z5 && value.f5750b);
            case 3:
                C0593a value2 = (C0593a) obj;
                i.e(value2, "value");
                return !value2.f5749a || value2.f5751c;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
