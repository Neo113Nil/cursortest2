package defpackage;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fpd implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            fpk fpkVar = (fpk) message.obj;
            int i3 = message.arg1;
            if (fpkVar.j()) {
                fpj fpjVar = fpkVar.j;
                if (fpjVar.getVisibility() == 0) {
                    if (fpjVar.c == 1) {
                        ValueAnimator c = fpkVar.c(1.0f, 0.0f);
                        c.setDuration(fpkVar.d);
                        c.addListener(new foz(fpkVar));
                        c.start();
                    } else {
                        ValueAnimator valueAnimator = new ValueAnimator();
                        valueAnimator.setIntValues(0, fpkVar.b());
                        valueAnimator.setInterpolator(fpkVar.f);
                        valueAnimator.setDuration(fpkVar.e);
                        valueAnimator.addListener(new fpc(fpkVar));
                        valueAnimator.addUpdateListener(new fpa(fpkVar, 4));
                        valueAnimator.start();
                    }
                    return true;
                }
            }
            fpkVar.k();
            return true;
        }
        fpk fpkVar2 = (fpk) message.obj;
        fpj fpjVar2 = fpkVar2.j;
        if (fpjVar2.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = fpjVar2.getLayoutParams();
            if (layoutParams instanceof tz) {
                tz tzVar = (tz) layoutParams;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                baseTransientBottomBar$Behavior.g.a = fpkVar2.u;
                baseTransientBottomBar$Behavior.f = new kee(fpkVar2);
                tzVar.b(baseTransientBottomBar$Behavior);
                if (fpkVar2.d() == null) {
                    tzVar.g = 80;
                }
            }
            ViewGroup viewGroup = fpkVar2.h;
            fpjVar2.g = true;
            viewGroup.addView(fpjVar2);
            fpjVar2.g = false;
            if (fpkVar2.d() != null) {
                int[] iArr = new int[2];
                fpkVar2.d().getLocationOnScreen(iArr);
                int i4 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                i2 = (iArr2[1] + viewGroup.getHeight()) - i4;
            }
            fpkVar2.p = i2;
            fpkVar2.i();
            fpjVar2.setVisibility(4);
        }
        if (fpjVar2.isLaidOut()) {
            fpkVar2.h();
        } else {
            fpkVar2.s = true;
        }
        return true;
    }
}
