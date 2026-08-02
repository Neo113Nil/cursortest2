package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pr implements afd {
    final /* synthetic */ ar a;
    private final /* synthetic */ int b;

    public pr(ar arVar, int i) {
        this.b = i;
        this.a = arVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r7 == 1) goto L68;
     */
    @Override // defpackage.afd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                CharSequence charSequence = (CharSequence) obj;
                ps psVar = (ps) this.a;
                Handler handler = psVar.aj;
                Runnable runnable = psVar.ak;
                handler.removeCallbacks(runnable);
                TextView textView = psVar.ap;
                if (textView != null) {
                    textView.setText(charSequence);
                }
                handler.postDelayed(runnable, 2000L);
                return;
            }
            if (((aer) obj) != null) {
                ar arVar = this.a;
                if (arVar.d) {
                    View J = arVar.J();
                    if (J.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (arVar.e != null) {
                        if (by.U(3)) {
                            toString();
                            Objects.toString(arVar.e);
                        }
                        arVar.e.setContentView(J);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        Integer num = (Integer) obj;
        ar arVar2 = this.a;
        ps psVar2 = (ps) arVar2;
        Handler handler2 = psVar2.aj;
        Runnable runnable2 = psVar2.ak;
        handler2.removeCallbacks(runnable2);
        int intValue = num.intValue();
        if (psVar2.ao != null) {
            int i2 = psVar2.al.w;
            Context x = arVar2.x();
            Drawable drawable = null;
            int i3 = 0;
            if (x == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i4 = R.drawable.fingerprint_dialog_fp_icon;
                if (i2 == 0) {
                    if (intValue == 1) {
                        intValue = 1;
                        i2 = 0;
                        drawable = x.getDrawable(i4);
                    } else {
                        i2 = 0;
                    }
                }
                int i5 = i2;
                if (i2 == 1) {
                    if (intValue == 2) {
                        i4 = 2131230927;
                        i2 = i5;
                        drawable = x.getDrawable(i4);
                    } else {
                        i2 = 1;
                    }
                }
                i5 = i2;
                if (i2 == 2) {
                    if (intValue != 1) {
                        i5 = 2;
                    }
                    i2 = i5;
                    drawable = x.getDrawable(i4);
                } else {
                    i5 = i2;
                }
                if (i2 != 1 || intValue != 3) {
                    i2 = i5;
                }
                i2 = i5;
                drawable = x.getDrawable(i4);
            }
            if (drawable != null) {
                psVar2.ao.setImageDrawable(drawable);
                if (i2 != 0) {
                    i3 = i2;
                }
                if (i3 != 1 ? !(i3 != 2 || intValue != 1) : intValue == 2) {
                    if (drawable instanceof AnimatedVectorDrawable) {
                        ((AnimatedVectorDrawable) drawable).start();
                    }
                }
                psVar2.al.w = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView2 = psVar2.ap;
        if (textView2 != null) {
            textView2.setTextColor(intValue2 == 2 ? psVar2.am : psVar2.an);
        }
        handler2.postDelayed(runnable2, 2000L);
    }
}
