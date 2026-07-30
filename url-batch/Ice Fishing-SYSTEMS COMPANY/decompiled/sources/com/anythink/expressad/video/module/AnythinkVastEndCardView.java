package com.anythink.expressad.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.expressad.video.module.a.a;
import com.anythink.expressad.video.signal.f;
import com.anythink.expressad.video.signal.factory.b;

/* loaded from: classes.dex */
public class AnythinkVastEndCardView extends AnythinkBaseView implements f {

    /* renamed from: n, reason: collision with root package name */
    private static final String f21777n = "anythink_reward_endcard_vast";

    /* renamed from: o, reason: collision with root package name */
    private ViewGroup f21778o;

    /* renamed from: p, reason: collision with root package name */
    private View f21779p;

    /* renamed from: q, reason: collision with root package name */
    private View f21780q;

    public AnythinkVastEndCardView(Context context) {
        super(context);
    }

    private void a() {
        if (this.f21604f) {
            setMatchParent();
            setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
            setClickable(true);
            ((RelativeLayout.LayoutParams) this.f21778o.getLayoutParams()).addRule(13, -1);
        }
    }

    private boolean b() {
        this.f21778o = (ViewGroup) findViewById(findID("anythink_rl_content"));
        this.f21779p = findViewById(findID("anythink_iv_vastclose"));
        View findViewById = findViewById(findID("anythink_iv_vastok"));
        this.f21780q = findViewById;
        return isNotNULL(this.f21778o, this.f21779p, findViewById);
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public final void c() {
        super.c();
        if (this.f21604f) {
            this.f21779p.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a aVar = AnythinkVastEndCardView.this.f21603e;
                    if (aVar != null) {
                        aVar.a(104, "");
                    }
                }
            });
            this.f21780q.setOnClickListener(new com.anythink.expressad.widget.a() { // from class: com.anythink.expressad.video.module.AnythinkVastEndCardView.2
                @Override // com.anythink.expressad.widget.a
                public final void a(View view) {
                    AnythinkVastEndCardView anythinkVastEndCardView = AnythinkVastEndCardView.this;
                    a aVar = anythinkVastEndCardView.f21603e;
                    if (aVar != null) {
                        aVar.a(108, anythinkVastEndCardView.d());
                    }
                }
            });
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkBaseView
    public void init(Context context) {
        int findLayout = findLayout(f21777n);
        if (findLayout >= 0) {
            this.f21601c.inflate(findLayout, this);
            this.f21778o = (ViewGroup) findViewById(findID("anythink_rl_content"));
            this.f21779p = findViewById(findID("anythink_iv_vastclose"));
            View findViewById = findViewById(findID("anythink_iv_vastok"));
            this.f21780q = findViewById;
            this.f21604f = isNotNULL(this.f21778o, this.f21779p, findViewById);
            c();
            if (this.f21604f) {
                setMatchParent();
                setBackgroundResource(findColor("anythink_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f21778o.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.f21603e.a(111, "");
    }

    @Override // com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
    }

    public AnythinkVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
