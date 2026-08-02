package defpackage;

import android.content.Context;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eaa {
    public static final jha a = new jha(17, null);
    public static final jha b = new jha(18, null);
    private final fym c;

    public eaa(fym fymVar) {
        this.c = fymVar;
    }

    public final void a(ImageView imageView, jha jhaVar) {
        Context context = imageView.getContext();
        context.getClass();
        imageView.setImageDrawable(this.c.i(context, jhaVar));
    }
}
