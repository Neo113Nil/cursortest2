package h1;

import com.unity3d.player.C1773r0;
import com.unity3d.player.ISoftInputListener;
import com.unity3d.player.M0;
import com.unity3d.player.RunnableC1775s0;

/* renamed from: h1.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2445f implements Q {

    /* renamed from: a, reason: collision with root package name */
    public C1773r0 f36739a;

    /* renamed from: b, reason: collision with root package name */
    public ISoftInputListener f36740b = null;

    @Override // h1.Q
    public final void a(M0 m02) {
    }

    @Override // h1.Q
    public final void hide() {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener == null) {
            T.a(6, "Soft input listener is not set, cannot hide soft input");
            return;
        }
        iSoftInputListener.hide();
        C1773r0 c1773r0 = this.f36739a;
        if (c1773r0 != null) {
            RunnableC1775s0 runnableC1775s0 = c1773r0.f22241a;
            runnableC1775s0.f22247a = true;
            if (runnableC1775s0.f22248b) {
                runnableC1775s0.f22249c.release();
            }
        }
    }

    @Override // h1.Q
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    @Override // h1.Q
    public final void setCharacterLimit(int i4) {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setCharacterLimit(i4);
        } else {
            T.a(6, "Soft input listener is not set, cannot set soft input character limit");
        }
    }

    @Override // h1.Q
    public final void setHideInputField(boolean z4) {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setHideInputField(z4);
        } else {
            T.a(6, "Soft input listener is not set, cannot set soft input field hidden");
        }
    }

    @Override // h1.Q
    public final void setSelection(int i4, int i5) {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setSelection(i4, i5);
        } else {
            T.a(6, "Soft input listener is not set, cannot set soft input selection");
        }
    }

    @Override // h1.Q
    public final void setText(String str) {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setText(str);
        } else {
            T.a(6, "Soft input listener is not set, cannot set soft input text");
        }
    }

    @Override // h1.Q
    public final void a(C1773r0 c1773r0) {
        this.f36739a = c1773r0;
    }

    @Override // h1.Q
    public final void a() {
    }

    @Override // h1.Q
    public final void a(String str, int i4, boolean z4, boolean z5, boolean z6, boolean z7, String str2, int i5, boolean z8, boolean z9) {
        ISoftInputListener iSoftInputListener = this.f36740b;
        if (iSoftInputListener != null) {
            iSoftInputListener.show(str, i4, z4, z5, z6, z7, str2, i5, z8, z9);
        } else {
            T.a(6, "Soft input listener is not set, cannot setup soft input");
        }
    }
}
