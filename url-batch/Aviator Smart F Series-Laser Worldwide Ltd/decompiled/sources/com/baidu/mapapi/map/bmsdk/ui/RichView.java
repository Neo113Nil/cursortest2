package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.CollisionBehavior;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import com.baidu.platform.comapi.bmsdk.xmlui.BmXmlParse;
import com.baidu.platform.comapi.bmsdk.xmlui.a;
import org.w3c.dom.Document;

/* loaded from: classes2.dex */
public class RichView {

    /* renamed from: a, reason: collision with root package name */
    private BmRichView f6488a = new BmRichView();

    /* renamed from: b, reason: collision with root package name */
    private BmBaseUI f6489b;

    public BmRichView getBmRichView() {
        return this.f6488a;
    }

    public BmBaseUI getView() {
        return this.f6489b;
    }

    public void setAnimation(Animation animation) {
        BmAnimation bmAnimation;
        if (animation == null || (bmAnimation = animation.bmAnimation) == null) {
            return;
        }
        this.f6488a.a(bmAnimation);
    }

    public void setCollisionBehavior(CollisionBehavior collisionBehavior) {
        this.f6488a.a(collisionBehavior.getNumber());
    }

    public void setCollisionPriority(short s7) {
        BmRichView bmRichView = this.f6488a;
        if (s7 < 0) {
            s7 = 0;
        }
        bmRichView.a(s7);
    }

    public void setLocated(Located located) {
        this.f6488a.b(located.getNumber());
    }

    public void setScale(float f8) {
        this.f6488a.a(f8);
    }

    public void setScaleX(float f8) {
        this.f6488a.b(f8);
    }

    public void setScaleY(float f8) {
        this.f6488a.c(f8);
    }

    public void setShowLevel(int i8, int i9) {
        this.f6488a.a(i8, i9);
    }

    public void setView(BaseUI baseUI) {
        this.f6488a.a(baseUI.getBmBaseUI());
    }

    public void setVisibility(int i8) {
        this.f6488a.c(i8);
    }

    public void setXmlView(String str) {
        Document a8 = BmXmlParse.a(str.getBytes());
        if (a8 != null) {
            this.f6488a = new a().a(a8);
        }
    }
}
