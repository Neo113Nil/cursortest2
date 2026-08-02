package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandProfileViewEvent;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsArticleViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewEvent;
import com.squareup.cash.offers.viewmodels.viewevents.OffersSearchViewEvent;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;

/* loaded from: classes9.dex */
public final class AbstractSignatureParts$$Lambda$2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Object arg$0;
    public final Object arg$1;
    public final int arg$2;

    public AbstractSignatureParts$$Lambda$2(int i, Function0 function0, Function1 function1) {
        this.$r8$classId = 3;
        this.arg$0 = function1;
        this.arg$2 = i;
        this.arg$1 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.arg$1;
        int i2 = this.arg$2;
        Object obj2 = this.arg$0;
        switch (i) {
            case 0:
                AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) obj2;
                AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers = (AbstractSignatureParts.TypeAndDefaultQualifiers) ((ArrayList) obj).get(i2);
                AnnotationQualifierApplicabilityType containerApplicabilityType = ((typeAndDefaultQualifiers.typeParameterForArgument == null) || (abstractSignatureParts.getContainerApplicabilityType() == AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS)) ? abstractSignatureParts.getContainerApplicabilityType() : AnnotationQualifierApplicabilityType.TYPE_USE;
                JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = typeAndDefaultQualifiers.defaultQualifiers;
                if (javaTypeQualifiersByElementType != null) {
                    break;
                }
                break;
            case 1:
                ((Function1) obj2).invoke(new LocalBrandProfileViewEvent.MenuItemClicked(((LocalBrandLocationMenuCarouselContentModel.Entry) obj).token, i2));
                break;
            case 2:
                ((Function1) obj2).invoke(new InvestingCryptoNewsViewEvent.ArticleClicked((InvestingCryptoNewsArticleViewModel) obj, i2));
                break;
            default:
                ((Function1) obj2).invoke(new OffersSearchViewEvent.FilterGroupClicked(i2));
                ((Function0) obj).invoke();
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AbstractSignatureParts$$Lambda$2(Object obj, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.arg$0 = obj;
        this.arg$1 = obj2;
        this.arg$2 = i;
    }
}
