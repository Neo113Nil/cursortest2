package com.baidu.mapapi.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.baidu.mapapi.map.SwipeDismissTouchListener;
import com.baidu.mapapi.map.WearMapView;

/* loaded from: classes2.dex */
public class SwipeDismissView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    WearMapView.OnDismissCallback f6269a;

    class a implements SwipeDismissTouchListener.DismissCallbacks {
        a() {
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public boolean canDismiss(Object obj) {
            return true;
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public void onDismiss(View view, Object obj) {
            WearMapView.OnDismissCallback onDismissCallback = SwipeDismissView.this.f6269a;
            if (onDismissCallback == null) {
                return;
            }
            onDismissCallback.onDismiss();
        }

        @Override // com.baidu.mapapi.map.SwipeDismissTouchListener.DismissCallbacks
        public void onNotify() {
            WearMapView.OnDismissCallback onDismissCallback = SwipeDismissView.this.f6269a;
            if (onDismissCallback == null) {
                return;
            }
            onDismissCallback.onNotify();
        }
    }

    public SwipeDismissView(Context context, View view) {
        super(context);
        this.f6269a = null;
        a(context, view);
    }

    void a(Context context, View view) {
        setOnTouchListener(new SwipeDismissTouchListener(view, new Object(), new a()));
    }

    public void setCallback(WearMapView.OnDismissCallback onDismissCallback) {
        this.f6269a = onDismissCallback;
    }

    public SwipeDismissView(Context context, AttributeSet attributeSet, View view) {
        super(context, attributeSet);
        this.f6269a = null;
        a(context, view);
    }

    public SwipeDismissView(Context context, AttributeSet attributeSet, int i8, View view) {
        super(context, attributeSet, i8);
        this.f6269a = null;
        a(context, view);
    }
}
