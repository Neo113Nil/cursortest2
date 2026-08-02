package com.withpersona.sdk2.inquiry;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0007\u001a\u000e\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"toInlineInquiryBuilder", "Lcom/withpersona/sdk2/inquiry/InlineInquiryBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryTemplateBuilder;", "Lcom/withpersona/sdk2/inquiry/InquiryBuilder;", "createFragment", "Landroidx/fragment/app/Fragment;", "inquiry-dynamic-feature_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InquiryUtilsKt {
    public static final Fragment createFragment(InlineInquiryBuilder inlineInquiryBuilder) {
        inlineInquiryBuilder.getClass();
        return inlineInquiryBuilder.build().createFragment();
    }

    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryTemplateBuilder inquiryTemplateBuilder) {
        inquiryTemplateBuilder.getClass();
        return inquiryTemplateBuilder.build().buildInlineInquiry();
    }

    public static final InlineInquiryBuilder toInlineInquiryBuilder(InquiryBuilder inquiryBuilder) {
        inquiryBuilder.getClass();
        return inquiryBuilder.build().buildInlineInquiry();
    }
}
