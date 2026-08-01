package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class a6 implements Runnable {
    public final /* synthetic */ TextView f;
    public final /* synthetic */ Typeface g;
    public final /* synthetic */ int h;

    public a6(TextView textView, Typeface typeface, int i) {
        this.f = textView;
        this.g = typeface;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f.setTypeface(this.g, this.h);
    }
}
