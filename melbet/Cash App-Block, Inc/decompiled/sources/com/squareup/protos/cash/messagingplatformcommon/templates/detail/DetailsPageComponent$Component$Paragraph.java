package com.squareup.protos.cash.messagingplatformcommon.templates.detail;

import com.google.android.gms.internal.mlkit_vision_common.zzjz;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class DetailsPageComponent$Component$Paragraph extends zzjz {
    public final DetailsPageParagraph value;

    public DetailsPageComponent$Component$Paragraph(DetailsPageParagraph detailsPageParagraph) {
        detailsPageParagraph.getClass();
        this.value = detailsPageParagraph;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DetailsPageComponent$Component$Paragraph) && Intrinsics.areEqual(this.value, ((DetailsPageComponent$Component$Paragraph) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Paragraph(value=" + this.value + ")";
    }
}
