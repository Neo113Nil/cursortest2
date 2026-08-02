package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;
import defpackage.aax;
import defpackage.aay;
import defpackage.abc;
import defpackage.nc;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ProtectionLayout extends FrameLayout {
    private static final Object a = new Object();
    private final List b;
    private aay c;

    public ProtectionLayout(Context context, List list) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            a();
            requestApplyInsets();
        }
    }

    private final void a() {
        abc abcVar;
        List list = this.b;
        if (list.isEmpty()) {
            b();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof abc) {
            abcVar = (abc) tag;
        } else {
            abcVar = new abc(viewGroup);
            viewGroup.setTag(R.id.tag_system_bar_state_monitor, abcVar);
        }
        b();
        this.c = new aay(abcVar, list);
        getChildCount();
        if (this.c.a() <= 0) {
            return;
        }
        this.c.d();
        getContext();
        throw null;
    }

    private final void b() {
        if (this.c != null) {
            removeViews(getChildCount() - this.c.a(), this.c.a());
            int a2 = this.c.a();
            aay aayVar = this.c;
            if (a2 > 0) {
                aayVar.d();
                throw null;
            }
            if (!aayVar.d) {
                aayVar.d = true;
                aayVar.b.b.remove(aayVar);
                ArrayList arrayList = aayVar.a;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((aax) arrayList.get(size)).b = null;
                    }
                }
                arrayList.clear();
            }
            this.c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != a) {
            aay aayVar = this.c;
            int childCount = getChildCount() - (aayVar != null ? aayVar.a() : 0);
            if (i > childCount || i < 0) {
                i = childCount;
            }
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof abc) {
            abc abcVar = (abc) tag;
            if (abcVar.b.isEmpty()) {
                abcVar.a.post(new nc(abcVar, 7));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = new ArrayList();
    }

    public ProtectionLayout(Context context) {
        super(context);
        this.b = new ArrayList();
    }
}
