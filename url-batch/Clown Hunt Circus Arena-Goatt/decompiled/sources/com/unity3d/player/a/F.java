package com.unity3d.player.a;

import com.unity3d.player.C0191s0;
import com.unity3d.player.ISoftInputListener;
import com.unity3d.player.N0;
import com.unity3d.player.RunnableC0193t0;

/* loaded from: classes.dex */
public final class F implements r {
    public C0191s0 a;
    public ISoftInputListener b = null;

    @Override // com.unity3d.player.a.r
    public final void a() {
    }

    @Override // com.unity3d.player.a.r
    public final void a(N0 n0) {
    }

    @Override // com.unity3d.player.a.r
    public final boolean isConsumeOutsideTouchesEnabled() {
        return false;
    }

    @Override // com.unity3d.player.a.r
    public final void a(C0191s0 c0191s0) {
        this.a = c0191s0;
    }

    @Override // com.unity3d.player.a.r
    public final void hide() {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.hide();
            C0191s0 c0191s0 = this.a;
            if (c0191s0 != null) {
                RunnableC0193t0 runnableC0193t0 = c0191s0.a;
                runnableC0193t0.a = true;
                if (runnableC0193t0.b) {
                    runnableC0193t0.c.release();
                    return;
                }
                return;
            }
            return;
        }
        t.Log(6, "Soft input listener is not set, cannot hide soft input");
    }

    @Override // com.unity3d.player.a.r
    public final void setText(String str) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setText(str);
        } else {
            t.Log(6, "Soft input listener is not set, cannot set soft input text");
        }
    }

    @Override // com.unity3d.player.a.r
    public final void setCharacterLimit(int i) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setCharacterLimit(i);
        } else {
            t.Log(6, "Soft input listener is not set, cannot set soft input character limit");
        }
    }

    @Override // com.unity3d.player.a.r
    public final void setHideInputField(boolean z) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setHideInputField(z);
        } else {
            t.Log(6, "Soft input listener is not set, cannot set soft input field hidden");
        }
    }

    @Override // com.unity3d.player.a.r
    public final void setSelection(int i, int i2) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.setSelection(i, i2);
        } else {
            t.Log(6, "Soft input listener is not set, cannot set soft input selection");
        }
    }

    @Override // com.unity3d.player.a.r
    public final void a(String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6) {
        ISoftInputListener iSoftInputListener = this.b;
        if (iSoftInputListener != null) {
            iSoftInputListener.show(str, i, z, z2, z3, z4, str2, i2, z5, z6);
        } else {
            t.Log(6, "Soft input listener is not set, cannot setup soft input");
        }
    }
}
