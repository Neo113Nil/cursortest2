package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfx extends lp {
    public final Object t;

    public gfx(View view, byte[] bArr) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.license);
    }

    public gfx(View view, TextView textView) {
        super(view);
        this.t = textView;
    }

    public gfx(View view, dze dzeVar) {
        super(view);
        this.t = dzeVar;
    }

    public gfx(View view) {
        super(view);
        this.t = view;
    }
}
