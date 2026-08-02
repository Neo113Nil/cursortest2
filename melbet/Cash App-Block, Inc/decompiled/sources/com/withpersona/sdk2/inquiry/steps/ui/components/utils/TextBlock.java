package com.withpersona.sdk2.inquiry.steps.ui.components.utils;

import android.text.SpannableStringBuilder;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public interface TextBlock {

    public final class ListTextBlock implements TextBlock {
        public final List textBlocks;

        public ListTextBlock(List list) {
            list.getClass();
            this.textBlocks = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListTextBlock) && Intrinsics.areEqual(this.textBlocks, ((ListTextBlock) obj).textBlocks);
        }

        public final int hashCode() {
            return this.textBlocks.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("ListTextBlock(textBlocks=", ")", this.textBlocks);
        }
    }

    public final class RegularTextBlock implements TextBlock {
        public final SpannableStringBuilder spanned;

        public RegularTextBlock(SpannableStringBuilder spannableStringBuilder) {
            this.spanned = spannableStringBuilder;
        }
    }
}
