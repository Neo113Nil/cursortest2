package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tg implements Runnable {
    public final /* synthetic */ TextView m;
    public final /* synthetic */ Typeface n;
    public final /* synthetic */ int o;

    public tg(TextView textView, Typeface typeface, int i) {
        this.m = textView;
        this.n = typeface;
        this.o = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.m.setTypeface(this.n, this.o);
    }
}
