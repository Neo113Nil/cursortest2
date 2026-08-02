package com.stripe.android.financialconnections.ui.sdui;

import com.stripe.android.financialconnections.ui.ImageResource$Network;
import com.stripe.android.financialconnections.ui.TextResource;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class BulletUI {
    public final TextResource content;
    public final ImageResource$Network imageResource;
    public final TextResource title;

    public BulletUI(TextResource.Text text, TextResource.Text text2, ImageResource$Network imageResource$Network) {
        this.title = text;
        this.content = text2;
        this.imageResource = imageResource$Network;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletUI)) {
            return false;
        }
        BulletUI bulletUI = (BulletUI) obj;
        return Intrinsics.areEqual(this.title, bulletUI.title) && Intrinsics.areEqual(this.content, bulletUI.content) && Intrinsics.areEqual(this.imageResource, bulletUI.imageResource);
    }

    public final int hashCode() {
        TextResource textResource = this.title;
        int hashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.content;
        int hashCode2 = (hashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        ImageResource$Network imageResource$Network = this.imageResource;
        return hashCode2 + (imageResource$Network != null ? imageResource$Network.hashCode() : 0);
    }

    public final String toString() {
        return "BulletUI(title=" + this.title + ", content=" + this.content + ", imageResource=" + this.imageResource + ")";
    }
}
