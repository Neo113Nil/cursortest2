package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class IXK6ba3ucyzm extends ClickableSpan {
    public final twy4zb2fCtqq OPXfSBeufaJ8;
    public final int rtx2ld2ELZv4;
    public final int wdg6QnbFHrFF;

    public IXK6ba3ucyzm(int i, twy4zb2fCtqq twy4zb2fctqq, int i2) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = twy4zb2fctqq;
        this.wdg6QnbFHrFF = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.rtx2ld2ELZv4);
        this.OPXfSBeufaJ8.PxuCJdSBwIXG.performAction(this.wdg6QnbFHrFF, bundle);
    }
}
