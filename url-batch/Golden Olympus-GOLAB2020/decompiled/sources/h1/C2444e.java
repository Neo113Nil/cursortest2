package h1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

/* renamed from: h1.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2444e extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public Button f36734a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f36735b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f36736c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f36737d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f36738e;

    public C2444e(Context context, EditText editText) {
        super(context);
        this.f36735b = editText;
        this.f36736c = context;
        this.f36737d = new Rect(16, 16, 16, 16);
        this.f36738e = new Rect(0, 0, 0, 0);
        a();
        setBackgroundColor(-1);
    }

    public void a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Button button = new Button(this.f36736c);
        this.f36734a = button;
        button.setId(View.generateViewId());
        this.f36734a.setText(this.f36736c.getResources().getIdentifier("ok", "string", "android"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(15);
        layoutParams.addRule(11);
        this.f36734a.setLayoutParams(layoutParams);
        this.f36734a.setBackgroundColor(0);
        addView(this.f36734a);
        this.f36735b.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, this.f36734a.getId());
        this.f36735b.setLayoutParams(layoutParams2);
        addView(this.f36735b);
        Rect rect = this.f36737d;
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f36734a.setOnClickListener(onClickListener);
    }
}
