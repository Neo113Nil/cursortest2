package h1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.unity3d.player.UnityPlayerForActivityOrService;

/* loaded from: classes2.dex */
public final class O extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final UnityPlayerForActivityOrService f36716a;

    /* renamed from: b, reason: collision with root package name */
    public final com.unity3d.player.U f36717b;

    public O(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.f36716a = unityPlayerForActivityOrService;
        com.unity3d.player.U u4 = new com.unity3d.player.U(unityPlayerForActivityOrService);
        this.f36717b = u4;
        addView(u4);
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        C2439A c2439a = this.f36717b.f22080a;
        if (c2439a == null || c2439a.f36700a <= 0.0f) {
            return this.f36716a.injectEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        return this.f36716a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i4, KeyEvent keyEvent) {
        return this.f36716a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyMultiple(int i4, int i5, KeyEvent keyEvent) {
        return this.f36716a.injectEvent(keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i4, KeyEvent keyEvent) {
        return this.f36716a.injectEvent(keyEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2439A c2439a = this.f36717b.f22080a;
        if (c2439a == null || c2439a.f36700a <= 0.0f) {
            return this.f36716a.injectEvent(motionEvent);
        }
        return false;
    }
}
