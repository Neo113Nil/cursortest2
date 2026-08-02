package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cuq extends cuw {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;
    final /* synthetic */ kee c;

    public cuq(Intent intent, WeakReference weakReference, kee keeVar) {
        this.a = intent;
        this.b = weakReference;
        this.c = keeVar;
    }

    @Override // defpackage.cuw
    public final void d(GoogleHelp googleHelp) {
        GoogleHelp googleHelp2;
        ViewGroup viewGroup;
        Intent intent = this.a;
        long nanoTime = System.nanoTime();
        intent.putExtra("EXTRA_START_TICK", nanoTime);
        Activity activity = (Activity) this.b.get();
        if (activity == null) {
            return;
        }
        kee keeVar = this.c;
        if (keeVar != null) {
            Context applicationContext = activity.getApplicationContext();
            googleHelp.B = true;
            googleHelp2 = googleHelp;
            dih.E(new cul(applicationContext, googleHelp2, keeVar, nanoTime, 1));
            dih.E(new cul(applicationContext, googleHelp2, keeVar, nanoTime, 0));
        } else {
            googleHelp2 = googleHelp;
        }
        googleHelp2.z = cll.b;
        TogglingData togglingData = googleHelp2.w;
        if (togglingData != null) {
            String charSequence = activity.getTitle().toString();
            int identifier = activity.getResources().getIdentifier("action_bar", "id", activity.getPackageName());
            if (identifier != 0 && (viewGroup = (ViewGroup) activity.findViewById(identifier)) != null) {
                int i = 0;
                while (true) {
                    if (i >= viewGroup.getChildCount()) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof TextView) {
                        charSequence = ((TextView) childAt).getText().toString();
                        break;
                    }
                    i++;
                }
            }
            togglingData.c = charSequence;
        }
        if (intent.hasExtra("EXTRA_GOOGLE_HELP")) {
            intent.putExtra("EXTRA_GOOGLE_HELP", googleHelp2);
        } else if (intent.hasExtra("EXTRA_IN_PRODUCT_HELP")) {
            Parcelable.Creator creator = cug.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("EXTRA_IN_PRODUCT_HELP");
            cug cugVar = (cug) (byteArrayExtra == null ? null : oy.o(byteArrayExtra, creator));
            cugVar.a = googleHelp2;
            intent.putExtra("EXTRA_IN_PRODUCT_HELP", oy.p(cugVar));
        }
        new gbg(Looper.getMainLooper(), (byte[]) null).post(new avl((Object) activity, (Object) intent, 14, (char[]) null));
    }
}
