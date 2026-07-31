package com.yandex.div.core.view2.divs;

import O1.C0759ca;
import O1.C0950n4;
import O1.C1060t7;
import O1.L5;
import O1.T7;
import O1.U7;
import android.text.method.DigitsKeyListener;
import android.text.method.KeyListener;
import com.yandex.div.core.util.mask.BaseInputMask;
import com.yandex.div.core.util.mask.CurrencyInputMask;
import com.yandex.div.core.util.mask.FixedLengthInputMask;
import com.yandex.div.core.util.mask.PhoneInputMask;
import com.yandex.div.core.util.mask.PhoneInputMaskKt;
import com.yandex.div.core.view2.divs.widgets.DivInputView;
import com.yandex.div.core.view2.errors.ErrorCollector;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class DivInputBinder$observeMask$updateMaskData$1 extends s implements Function1<Object, Unit> {
    final /* synthetic */ Function2<Exception, Function0<Unit>, Unit> $catchCommonMaskException;
    final /* synthetic */ KeyListener $defaultKeyListener;
    final /* synthetic */ C1060t7 $div;
    final /* synthetic */ ErrorCollector $errorCollector;
    final /* synthetic */ G $inputMask;
    final /* synthetic */ Function1<BaseInputMask, Unit> $onMaskUpdate;
    final /* synthetic */ ExpressionResolver $resolver;
    final /* synthetic */ DivInputView $this_observeMask;

    @Metadata
    /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements Function1<Exception, Unit> {
        final /* synthetic */ Function2<Exception, Function0<Unit>, Unit> $catchCommonMaskException;

        @Metadata
        /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements Function0<Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m110invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m110invoke();
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(Function2<? super Exception, ? super Function0<Unit>, Unit> function2) {
            super(1);
            this.$catchCommonMaskException = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$catchCommonMaskException.invoke(it, AnonymousClass1.INSTANCE);
        }
    }

    @Metadata
    /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$4, reason: invalid class name */
    static final class AnonymousClass4 extends s implements Function1<Exception, Unit> {
        final /* synthetic */ Function2<Exception, Function0<Unit>, Unit> $catchCommonMaskException;

        @Metadata
        /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements Function0<Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m111invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m111invoke();
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(Function2<? super Exception, ? super Function0<Unit>, Unit> function2) {
            super(1);
            this.$catchCommonMaskException = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$catchCommonMaskException.invoke(it, AnonymousClass1.INSTANCE);
        }
    }

    @Metadata
    /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$6, reason: invalid class name */
    static final class AnonymousClass6 extends s implements Function1<Exception, Unit> {
        final /* synthetic */ Function2<Exception, Function0<Unit>, Unit> $catchCommonMaskException;

        @Metadata
        /* renamed from: com.yandex.div.core.view2.divs.DivInputBinder$observeMask$updateMaskData$1$6$1, reason: invalid class name */
        static final class AnonymousClass1 extends s implements Function0<Unit> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            AnonymousClass1() {
                super(0);
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m112invoke() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m112invoke();
                return Unit.f41027a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(Function2<? super Exception, ? super Function0<Unit>, Unit> function2) {
            super(1);
            this.$catchCommonMaskException = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return Unit.f41027a;
        }

        public final void invoke(@NotNull Exception it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$catchCommonMaskException.invoke(it, AnonymousClass1.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DivInputBinder$observeMask$updateMaskData$1(C1060t7 c1060t7, G g4, DivInputView divInputView, KeyListener keyListener, ExpressionResolver expressionResolver, Function1<? super BaseInputMask, Unit> function1, Function2<? super Exception, ? super Function0<Unit>, Unit> function2, ErrorCollector errorCollector) {
        super(1);
        this.$div = c1060t7;
        this.$inputMask = g4;
        this.$this_observeMask = divInputView;
        this.$defaultKeyListener = keyListener;
        this.$resolver = expressionResolver;
        this.$onMaskUpdate = function1;
        this.$catchCommonMaskException = function2;
        this.$errorCollector = errorCollector;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m109invoke(obj);
        return Unit.f41027a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m109invoke(@NotNull Object obj) {
        BaseInputMask baseInputMask;
        Locale locale;
        Intrinsics.checkNotNullParameter(obj, "<anonymous parameter 0>");
        T7 t7 = this.$div.f8006H;
        BaseInputMask baseInputMask2 = null;
        U7 b4 = t7 != null ? t7.b() : null;
        G g4 = this.$inputMask;
        if (b4 instanceof L5) {
            this.$this_observeMask.setKeyListener(this.$defaultKeyListener);
            L5 l5 = (L5) b4;
            String str = (String) l5.f3683b.evaluate(this.$resolver);
            List<L5.c> list = l5.f3684c;
            ExpressionResolver expressionResolver = this.$resolver;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (L5.c cVar : list) {
                char b12 = StringsKt.b1((CharSequence) cVar.f3691a.evaluate(expressionResolver));
                Expression expression = cVar.f3693c;
                String str2 = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Character c12 = StringsKt.c1((CharSequence) cVar.f3692b.evaluate(expressionResolver));
                arrayList.add(new BaseInputMask.MaskKey(b12, str2, c12 != null ? c12.charValue() : (char) 0));
            }
            BaseInputMask.MaskData maskData = new BaseInputMask.MaskData(str, arrayList, ((Boolean) l5.f3682a.evaluate(this.$resolver)).booleanValue());
            baseInputMask = (BaseInputMask) this.$inputMask.f41132b;
            if (baseInputMask != null) {
                BaseInputMask.updateMaskData$default(baseInputMask, maskData, false, 2, null);
                baseInputMask2 = baseInputMask;
            } else {
                baseInputMask2 = new FixedLengthInputMask(maskData, new AnonymousClass2(this.$catchCommonMaskException));
            }
        } else if (b4 instanceof C0950n4) {
            Expression expression2 = ((C0950n4) b4).f7144a;
            String str3 = expression2 != null ? (String) expression2.evaluate(this.$resolver) : null;
            if (str3 != null) {
                locale = Locale.forLanguageTag(str3);
                ErrorCollector errorCollector = this.$errorCollector;
                String languageTag = locale.toLanguageTag();
                if (!Intrinsics.areEqual(languageTag, str3)) {
                    errorCollector.logWarning(new IllegalArgumentException("Original locale tag '" + str3 + "' is not equals to final one '" + languageTag + '\''));
                }
            } else {
                locale = Locale.getDefault();
            }
            this.$this_observeMask.setKeyListener(DigitsKeyListener.getInstance("1234567890.,"));
            Object obj2 = this.$inputMask.f41132b;
            BaseInputMask baseInputMask3 = (BaseInputMask) obj2;
            if (baseInputMask3 != null) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.yandex.div.core.util.mask.CurrencyInputMask");
                Intrinsics.checkNotNullExpressionValue(locale, "locale");
                ((CurrencyInputMask) obj2).updateCurrencyParams(locale);
                baseInputMask2 = baseInputMask3;
            } else {
                Intrinsics.checkNotNullExpressionValue(locale, "locale");
                baseInputMask2 = new CurrencyInputMask(locale, new AnonymousClass4(this.$catchCommonMaskException));
            }
        } else if (b4 instanceof C0759ca) {
            this.$this_observeMask.setKeyListener(DigitsKeyListener.getInstance("1234567890"));
            baseInputMask = (BaseInputMask) this.$inputMask.f41132b;
            if (baseInputMask != null) {
                BaseInputMask.updateMaskData$default(baseInputMask, PhoneInputMaskKt.getDEFAULT_MASK_DATA(), false, 2, null);
                baseInputMask2 = baseInputMask;
            } else {
                baseInputMask2 = new PhoneInputMask(new AnonymousClass6(this.$catchCommonMaskException));
            }
        } else {
            this.$this_observeMask.setKeyListener(this.$defaultKeyListener);
        }
        g4.f41132b = baseInputMask2;
        this.$onMaskUpdate.invoke(this.$inputMask.f41132b);
    }
}
