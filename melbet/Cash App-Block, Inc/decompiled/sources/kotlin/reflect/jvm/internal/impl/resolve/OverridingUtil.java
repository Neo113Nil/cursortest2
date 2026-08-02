package kotlin.reflect.jvm.internal.impl.resolve;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.local.presenters.LocalEditorialPresenter;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.mlkit.vision.common.internal.CommonConvertUtils;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberStart;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.pools.presenters.PoolMemberListPresenter;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.shopping.autofill.presenters.AutofillState;
import com.squareup.cash.shopping.autofill.presenters.RealAutofillNetworkFailureMessageGenerator;
import com.squareup.cash.shopping.autofill.presenters.ShoppingAutofillAnalyticsHandler;
import com.squareup.cash.shopping.autofill.screens.AutofillAnalyticsParam;
import com.squareup.cash.shopping.autofill.screens.EditAutofillScreen;
import com.squareup.cash.support.presenters.SupportHomePresenter;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.stripe.android.StripePaymentController$$ExternalSyntheticLambda1;
import com.stripe.android.core.networking.MarkdownParser$$ExternalSyntheticLambda0;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeKt;
import dev.chrisbanes.haze.HazeTint;
import dev.chrisbanes.haze.ScrimBlurEffect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$22;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EnumEntrySyntheticClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyAccessorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotationsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$$Lambda$1;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$NotFound;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.WithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import kotlinx.coroutines.CancellableContinuationImpl;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.Handlers$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class OverridingUtil {
    public static final OverridingUtil DEFAULT;
    public static final AnonymousClass1 DEFAULT_TYPE_CONSTRUCTOR_EQUALITY;
    public static final List EXTERNAL_CONDITIONS = CollectionsKt.toList(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));
    public final KotlinTypeChecker.TypeConstructorEquality equalityAxioms;
    public final KotlinTypePreparator kotlinTypePreparator;
    public final KotlinTypeRefiner kotlinTypeRefiner;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$1, reason: invalid class name */
    public final class AnonymousClass1 implements KotlinTypeChecker.TypeConstructorEquality {
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        public final boolean equals(TypeConstructor typeConstructor, TypeConstructor typeConstructor2) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
                throw null;
            }
            if (typeConstructor2 != null) {
                return typeConstructor.equals(typeConstructor2);
            }
            $$$reportNull$$$0(1);
            throw null;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$2, reason: invalid class name */
    public final class AnonymousClass2 implements Function2 {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass2(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 0:
                    return new Pair((CallableDescriptor) obj, (CallableDescriptor) obj2);
                default:
                    return Boolean.FALSE;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$4, reason: invalid class name */
    public final class AnonymousClass4 implements Function1 {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass4(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return (CallableMemberDescriptor) obj;
                case 1:
                    DescriptorRendererOptions descriptorRendererOptions = (DescriptorRendererOptions) obj;
                    descriptorRendererOptions.setWithDefinedIn(false);
                    descriptorRendererOptions.setVerbose(true);
                    descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
                    descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
                    return Unit.INSTANCE;
                default:
                    return (CallableMemberDescriptor) obj;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$7, reason: invalid class name */
    public final class AnonymousClass7 implements Function1 {
        public final /* synthetic */ int $r8$classId;
        public final Object val$overrider;
        public final Object val$strategy;

        public /* synthetic */ AnonymousClass7(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.val$strategy = obj;
            this.val$overrider = obj2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            WithMigrationStatus knownNullability;
            CommonConvertUtils commonConvertUtils;
            Map<Integer, JavaTypeQualifiers> map;
            JavaTypeQualifiers javaTypeQualifiers;
            TypeConstructorMarker typeConstructor;
            List<TypeParameterMarker> parameters;
            int i = this.$r8$classId;
            Object obj2 = this.val$overrider;
            Object obj3 = this.val$strategy;
            switch (i) {
                case 0:
                    ((OverridingStrategy) obj3).inheritanceConflict((CallableMemberDescriptor) obj2, (CallableMemberDescriptor) obj);
                    return Unit.INSTANCE;
                case 1:
                    List list = (List) obj;
                    list.getClass();
                    DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj3;
                    if (delegatingSoftwareKeyboardController != null) {
                        delegatingSoftwareKeyboardController.hide();
                    }
                    ((Function1) obj2).invoke(new PersonalizePaymentViewEvent.Send(list));
                    return Unit.INSTANCE;
                case 2:
                    return ((PoolDetailsViewKt$$ExternalSyntheticLambda3) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                case 3:
                    AskedQuestion askedQuestion = (AskedQuestion) obj;
                    askedQuestion.getClass();
                    PoolMemberListScreen poolMemberListScreen = ((PoolMemberListPresenter) obj3).args;
                    String str = poolMemberListScreen.token;
                    List list2 = (List) ((MutableState) obj2).getValue();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String str2 = ((PoolParticipant) it.next()).customer_identifier;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                    return new PoolInvitePeopleListScreen(str, arrayList, poolMemberListScreen.shareUrl, askedQuestion, AssetPoolAddMemberStart.AddMemberSource.MEMBER_LIST, poolMemberListScreen.flowToken);
                case 4:
                    ApiResult.Failure failure = (ApiResult.Failure) obj;
                    failure.getClass();
                    LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj3;
                    RealAutofillNetworkFailureMessageGenerator realAutofillNetworkFailureMessageGenerator = (RealAutofillNetworkFailureMessageGenerator) localEditorialPresenter.installedStore;
                    EditAutofillScreen editAutofillScreen = (EditAutofillScreen) localEditorialPresenter.clock;
                    String str3 = (String) realAutofillNetworkFailureMessageGenerator.getSubmitErrorMessaging(editAutofillScreen.origin, failure).first;
                    AutofillAnalyticsParam autofillAnalyticsParam = editAutofillScreen.analyticsParam;
                    if (autofillAnalyticsParam != null) {
                        ((ShoppingAutofillAnalyticsHandler) localEditorialPresenter.service).trackBrowserCheckoutViewAutofillError(autofillAnalyticsParam, str3);
                    }
                    ((MutableState) obj2).setValue(new AutofillState.Error(failure));
                    return Unit.INSTANCE;
                case 5:
                    AskedQuestion askedQuestion2 = (AskedQuestion) obj;
                    askedQuestion2.getClass();
                    return new SupportScreens.SupportSheets.SupportHomeContactOptionsSheetScreen(((SupportHomePresenter) obj3).args.data, (List) obj2, askedQuestion2);
                case 6:
                    return ((StripePaymentController$$ExternalSyntheticLambda1) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
                case 7:
                    return ((StripePaymentController$$ExternalSyntheticLambda1) obj3).invoke(((ArrayList) obj2).get(((Number) obj).intValue()));
                case 8:
                    return ((StripePaymentController$$ExternalSyntheticLambda1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                case 9:
                    ((StripePaymentController$$ExternalSyntheticLambda1) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                    return "day";
                case 10:
                    return ((MarkdownParser$$ExternalSyntheticLambda0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                case 11:
                    return ((MarkdownParser$$ExternalSyntheticLambda0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                case 12:
                    return ((MarkdownParser$$ExternalSyntheticLambda0) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
                case 13:
                    PartnerAccount partnerAccount = (PartnerAccount) obj;
                    partnerAccount.getClass();
                    if (!(((Async) obj3) instanceof Async.Loading)) {
                        ((Function1) obj2).invoke(partnerAccount);
                    }
                    return Unit.INSTANCE;
                case 14:
                    WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) obj;
                    windowInsetsCompat.getClass();
                    Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj3;
                    if (!ref$BooleanRef.element) {
                        Insets insets = windowInsetsCompat.mImpl.getInsets(8);
                        insets.getClass();
                        if (insets.bottom > 0) {
                            ref$BooleanRef.element = true;
                            Result.Companion companion = Result.Companion;
                            ((CancellableContinuationImpl) obj2).resumeWith(Unit.INSTANCE);
                        }
                    }
                    return Unit.INSTANCE;
                case 15:
                    DrawScope drawScope = (DrawScope) obj;
                    drawScope.getClass();
                    HazeKt.m4112drawScrimDBWKusU(drawScope, (HazeTint) obj3, ((ScrimBlurEffect) obj2).node, 0L, drawScope.mo753getSizeNHjbRc());
                    return Unit.INSTANCE;
                case 16:
                    AbstractAnnotationTypeQualifierResolver abstractAnnotationTypeQualifierResolver = (AbstractAnnotationTypeQualifierResolver) obj3;
                    Function1 function1 = (Function1) obj2;
                    LinkedHashMap linkedHashMap = AbstractAnnotationTypeQualifierResolver.JAVA_APPLICABILITY_TYPES;
                    obj.getClass();
                    WithMigrationStatus knownNullability2 = abstractAnnotationTypeQualifierResolver.knownNullability(obj, ((Boolean) function1.invoke(obj)).booleanValue());
                    if (knownNullability2 != null) {
                        return knownNullability2;
                    }
                    Object resolveTypeQualifierAnnotation = abstractAnnotationTypeQualifierResolver.resolveTypeQualifierAnnotation(obj);
                    if (resolveTypeQualifierAnnotation == null) {
                        return null;
                    }
                    ReportLevel resolveJsr305AnnotationState = abstractAnnotationTypeQualifierResolver.resolveJsr305AnnotationState(obj);
                    if (resolveJsr305AnnotationState.isIgnore() || (knownNullability = abstractAnnotationTypeQualifierResolver.knownNullability(resolveTypeQualifierAnnotation, ((Boolean) function1.invoke(resolveTypeQualifierAnnotation)).booleanValue())) == null) {
                        return null;
                    }
                    return WithMigrationStatus.copy$default(knownNullability, null, resolveJsr305AnnotationState.isWarning(), 1, null);
                case 17:
                    LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) obj3;
                    LazyJavaResolverContext lazyJavaResolverContext = (LazyJavaResolverContext) obj2;
                    Name name = (Name) obj;
                    int i2 = LazyJavaClassMemberScope.$r8$clinit;
                    name.getClass();
                    NotNullLazyValue notNullLazyValue = lazyJavaClassMemberScope.nestedClassIndex;
                    ClassDescriptor classDescriptor = lazyJavaClassMemberScope.ownerDescriptor;
                    if (((Set) notNullLazyValue.invoke()).contains(name)) {
                        JavaClassFinder finder = lazyJavaResolverContext.getComponents().getFinder();
                        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                        classId.getClass();
                        JavaClass findClass = finder.findClass(new JavaClassFinder.Request(classId.createNestedClassId(name), null, lazyJavaClassMemberScope.jClass, 2, null));
                        if (findClass == null) {
                            return null;
                        }
                        LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(lazyJavaResolverContext, lazyJavaClassMemberScope.ownerDescriptor, findClass, null, 8, null);
                        lazyJavaResolverContext.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                        return lazyJavaClassDescriptor;
                    }
                    if (!((Set) lazyJavaClassMemberScope.generatedNestedClassNames.invoke()).contains(name)) {
                        JavaField javaField = (JavaField) ((Map) lazyJavaClassMemberScope.enumEntryIndex.invoke()).get(name);
                        if (javaField != null) {
                            return EnumEntrySyntheticClassDescriptor.create(lazyJavaResolverContext.getStorageManager(), lazyJavaClassMemberScope.ownerDescriptor, name, lazyJavaResolverContext.getStorageManager().createLazyValue(new LazyJavaClassMemberScope$$Lambda$1(lazyJavaClassMemberScope, 2)), LazyJavaAnnotationsKt.resolveAnnotations(lazyJavaResolverContext, javaField), lazyJavaResolverContext.getComponents().getSourceElementFactory().source(javaField));
                        }
                        return null;
                    }
                    ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                    lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateNestedClass(classDescriptor, name, createListBuilder, lazyJavaResolverContext);
                    ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                    int size = build.getSize();
                    if (size == 0) {
                        return null;
                    }
                    if (size == 1) {
                        return (ClassDescriptor) CollectionsKt.single((List) build);
                    }
                    Handlers$$ExternalSyntheticBUOutline0.m(build, "Multiple classes with same name are generated: ");
                    return null;
                case 18:
                    SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) obj3;
                    LazyJavaClassMemberScope lazyJavaClassMemberScope2 = (LazyJavaClassMemberScope) obj2;
                    Name name2 = (Name) obj;
                    int i3 = LazyJavaClassMemberScope.$r8$clinit;
                    name2.getClass();
                    return Intrinsics.areEqual(simpleFunctionDescriptor.getName(), name2) ? CollectionsKt__CollectionsJVMKt.listOf(simpleFunctionDescriptor) : CollectionsKt.plus((Iterable) lazyJavaClassMemberScope2.searchMethodsInSupertypesWithoutBuiltinMagic(name2), (Collection) lazyJavaClassMemberScope2.searchMethodsByNameWithoutBuiltinMagic(name2));
                case 19:
                    LazyJavaPackageScope lazyJavaPackageScope = (LazyJavaPackageScope) obj3;
                    LazyJavaResolverContext lazyJavaResolverContext2 = (LazyJavaResolverContext) obj2;
                    LazyJavaPackageScope.FindClassRequest findClassRequest = (LazyJavaPackageScope.FindClassRequest) obj;
                    int i4 = LazyJavaPackageScope.$r8$clinit;
                    findClassRequest.getClass();
                    LazyJavaPackageFragment lazyJavaPackageFragment = lazyJavaPackageScope.ownerDescriptor;
                    ClassId classId2 = new ClassId(lazyJavaPackageFragment.getFqName(), findClassRequest.name);
                    JavaClass javaClass = findClassRequest.javaClass;
                    KotlinClassFinder.Result findKotlinClassOrContent = javaClass != null ? lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(javaClass, lazyJavaPackageScope.getMetadataVersion()) : lazyJavaResolverContext2.getComponents().getKotlinClassFinder().findKotlinClassOrContent(classId2, lazyJavaPackageScope.getMetadataVersion());
                    KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
                    ClassId classId3 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
                    if (classId3 != null && (classId3.isNestedClass() || classId3.isLocal())) {
                        return null;
                    }
                    if (kotlinJvmBinaryClass == null) {
                        commonConvertUtils = LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                    } else if (kotlinJvmBinaryClass.getClassHeader().getKind() == KotlinClassHeader.Kind.CLASS) {
                        final ClassDescriptor resolveClass = lazyJavaPackageScope.c.getComponents().getDeserializedDescriptorResolver().resolveClass(kotlinJvmBinaryClass);
                        commonConvertUtils = resolveClass != null ? new CommonConvertUtils(resolveClass) { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope$KotlinClassLookupResult$Found
                            public final ClassDescriptor descriptor;

                            {
                                resolveClass.getClass();
                                this.descriptor = resolveClass;
                            }

                            public final ClassDescriptor getDescriptor() {
                                return this.descriptor;
                            }
                        } : LazyJavaPackageScope$KotlinClassLookupResult$NotFound.INSTANCE;
                    } else {
                        commonConvertUtils = LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass.INSTANCE;
                    }
                    if (commonConvertUtils instanceof LazyJavaPackageScope$KotlinClassLookupResult$Found) {
                        return ((LazyJavaPackageScope$KotlinClassLookupResult$Found) commonConvertUtils).getDescriptor();
                    }
                    if (commonConvertUtils instanceof LazyJavaPackageScope$KotlinClassLookupResult$SyntheticClass) {
                        return null;
                    }
                    if (!(commonConvertUtils instanceof LazyJavaPackageScope$KotlinClassLookupResult$NotFound)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    if (javaClass == null) {
                        JavaClassFinder finder2 = lazyJavaResolverContext2.getComponents().getFinder();
                        KotlinClassFinder.Result.ClassFileContent classFileContent = findKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) findKotlinClassOrContent : null;
                        javaClass = finder2.findClass(new JavaClassFinder.Request(classId2, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                    }
                    if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                        FqName fqName = javaClass != null ? javaClass.getFqName() : null;
                        if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), lazyJavaPackageFragment.getFqName())) {
                            return null;
                        }
                        LazyJavaClassDescriptor lazyJavaClassDescriptor2 = new LazyJavaClassDescriptor(lazyJavaResolverContext2, lazyJavaPackageScope.ownerDescriptor, javaClass, null, 8, null);
                        lazyJavaResolverContext2.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor2);
                        return lazyJavaClassDescriptor2;
                    }
                    StringBuilder sb = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                    sb.append(javaClass);
                    sb.append("\nClassId: ");
                    sb.append(classId2);
                    sb.append("\nfindKotlinClass(JavaClass) = ");
                    sb.append(KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), javaClass, lazyJavaPackageScope.getMetadataVersion()));
                    KotlinJvmBinaryClass findKotlinClass = KotlinClassFinderKt.findKotlinClass(lazyJavaResolverContext2.getComponents().getKotlinClassFinder(), classId2, lazyJavaPackageScope.getMetadataVersion());
                    sb.append("\nfindKotlinClass(ClassId) = ");
                    sb.append(findKotlinClass);
                    sb.append('\n');
                    throw new IllegalStateException(sb.toString());
                case 20:
                    obj.getClass();
                    return Boolean.valueOf(((AbstractSignatureParts) obj3).forceWarning(obj, ((AbstractSignatureParts.TypeAndDefaultQualifiers) obj2).f1531type));
                case 21:
                    TypeEnhancementInfo typeEnhancementInfo = (TypeEnhancementInfo) obj3;
                    JavaTypeQualifiers[] javaTypeQualifiersArr = (JavaTypeQualifiers[]) obj2;
                    int intValue = ((Number) obj).intValue();
                    return (typeEnhancementInfo == null || (map = typeEnhancementInfo.getMap()) == null || (javaTypeQualifiers = map.get(Integer.valueOf(intValue))) == null) ? (intValue < 0 || intValue >= javaTypeQualifiersArr.length) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[intValue] : javaTypeQualifiers;
                case 22:
                    AbstractSignatureParts abstractSignatureParts = (AbstractSignatureParts) obj3;
                    TypeSystemContext typeSystemContext = (TypeSystemContext) obj2;
                    AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers = (AbstractSignatureParts.TypeAndDefaultQualifiers) obj;
                    typeAndDefaultQualifiers.getClass();
                    KotlinTypeMarker kotlinTypeMarker = typeAndDefaultQualifiers.f1531type;
                    if ((abstractSignatureParts.getSkipRawTypeArguments() && kotlinTypeMarker != null && typeSystemContext.isRawType(kotlinTypeMarker)) || kotlinTypeMarker == null || (typeConstructor = typeSystemContext.typeConstructor(kotlinTypeMarker)) == null || (parameters = typeSystemContext.getParameters(typeConstructor)) == null) {
                        return null;
                    }
                    List<TypeParameterMarker> list3 = parameters;
                    List<TypeArgumentMarker> arguments = typeSystemContext.getArguments(kotlinTypeMarker);
                    Iterator<T> it2 = list3.iterator();
                    Iterator<T> it3 = arguments.iterator();
                    ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10), CollectionsKt__IterablesKt.collectionSizeOrDefault(arguments, 10)));
                    while (it2.hasNext() && it3.hasNext()) {
                        TypeParameterMarker typeParameterMarker = (TypeParameterMarker) it2.next();
                        KotlinTypeMarker type2 = typeSystemContext.getType((TypeArgumentMarker) it3.next());
                        JavaTypeQualifiersByElementType javaTypeQualifiersByElementType = typeAndDefaultQualifiers.defaultQualifiers;
                        arrayList2.add(type2 == null ? new AbstractSignatureParts.TypeAndDefaultQualifiers(null, javaTypeQualifiersByElementType, typeParameterMarker) : new AbstractSignatureParts.TypeAndDefaultQualifiers(type2, AbstractAnnotationTypeQualifierResolver.extractAndMergeDefaultQualifiers$default(abstractSignatureParts.getAnnotationTypeQualifierResolver(), javaTypeQualifiersByElementType, abstractSignatureParts.getAnnotations(type2), false, 4, null), typeParameterMarker));
                    }
                    return arrayList2;
                default:
                    DeserializedClassDescriptor.EnumEntryClassDescriptors enumEntryClassDescriptors = (DeserializedClassDescriptor.EnumEntryClassDescriptors) obj3;
                    DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) obj2;
                    Name name3 = (Name) obj;
                    name3.getClass();
                    ProtoBuf.EnumEntry enumEntry = (ProtoBuf.EnumEntry) enumEntryClassDescriptors.enumEntryProtos.get(name3);
                    if (enumEntry != null) {
                        return EnumEntrySyntheticClassDescriptor.create(deserializedClassDescriptor.getC().getStorageManager(), deserializedClassDescriptor, name3, enumEntryClassDescriptors.enumMemberNames, new DeserializedAnnotations(deserializedClassDescriptor.getC().getStorageManager(), new KClassImpl$Data$$Lambda$22(27, deserializedClassDescriptor, enumEntry)), SourceElement.NO_SOURCE);
                    }
                    return null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$8, reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass8 {
        public static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$descriptors$Modality;
        public static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result;
        public static final /* synthetic */ int[] $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result;

        static {
            int[] iArr = new int[Modality.values().length];
            $SwitchMap$org$jetbrains$kotlin$descriptors$Modality = iArr;
            try {
                iArr[Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[Modality.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[Modality.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$descriptors$Modality[Modality.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result = iArr2;
            try {
                iArr2[OverrideCompatibilityInfo.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[OverrideCompatibilityInfo.Result.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[OverrideCompatibilityInfo.Result.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result = iArr3;
            try {
                iArr3[ExternalOverridabilityCondition.Result.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[ExternalOverridabilityCondition.Result.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[ExternalOverridabilityCondition.Result.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class OverrideCompatibilityInfo {
        public static final OverrideCompatibilityInfo SUCCESS = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");
        public final String debugMessage;
        public final Result overridable;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {
            public static final /* synthetic */ Result[] $VALUES;
            public static final Result CONFLICT;
            public static final Result INCOMPATIBLE;
            public static final Result OVERRIDABLE;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                OVERRIDABLE = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                INCOMPATIBLE = result2;
                Result result3 = new Result("CONFLICT", 2);
                CONFLICT = result3;
                $VALUES = new Result[]{result, result2, result3};
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0045  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static /* synthetic */ void $$$reportNull$$$0(int i) {
            String format2;
            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
            if (i != 1 && i != 2) {
                if (i == 3) {
                    objArr[0] = "success";
                } else if (i != 4) {
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                }
                switch (i) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                        break;
                    case 5:
                        objArr[1] = "getResult";
                        break;
                    case 6:
                        objArr[1] = "getDebugMessage";
                        break;
                    default:
                        objArr[1] = "success";
                        break;
                }
                if (i != 1) {
                    objArr[2] = "incompatible";
                } else if (i == 2) {
                    objArr[2] = "conflict";
                } else if (i == 3 || i == 4) {
                    objArr[2] = "<init>";
                }
                format2 = String.format(str, objArr);
                if (i == 1 && i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException(format2);
                }
                throw new IllegalArgumentException(format2);
            }
            objArr[0] = "debugMessage";
            switch (i) {
            }
            if (i != 1) {
            }
            format2 = String.format(str, objArr);
            if (i == 1) {
            }
            throw new IllegalArgumentException(format2);
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                $$$reportNull$$$0(3);
                throw null;
            }
            if (str == null) {
                $$$reportNull$$$0(4);
                throw null;
            }
            this.overridable = result;
            this.debugMessage = str;
        }

        public static OverrideCompatibilityInfo conflict(String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.CONFLICT, str);
            }
            $$$reportNull$$$0(2);
            throw null;
        }

        public static OverrideCompatibilityInfo incompatible(String str) {
            if (str != null) {
                return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
            }
            $$$reportNull$$$0(1);
            throw null;
        }

        public static OverrideCompatibilityInfo success() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = SUCCESS;
            if (overrideCompatibilityInfo != null) {
                return overrideCompatibilityInfo;
            }
            $$$reportNull$$$0(0);
            throw null;
        }

        public Result getResult() {
            Result result = this.overridable;
            if (result != null) {
                return result;
            }
            $$$reportNull$$$0(5);
            throw null;
        }

        public String toString() {
            return this.overridable + ": " + this.debugMessage;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0058 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0266  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        Object[] objArr;
        if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case 80:
                                case 81:
                                case 82:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
            }
            if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
                switch (i) {
                    default:
                        switch (i) {
                            default:
                                switch (i) {
                                    default:
                                        switch (i) {
                                            case 88:
                                            case 89:
                                            case 90:
                                                break;
                                            default:
                                                i2 = 3;
                                                break;
                                        }
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                        i2 = 2;
                                        break;
                                }
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                                break;
                        }
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        break;
                }
                objArr = new Object[i2];
                switch (i) {
                    case 1:
                    case 7:
                        objArr[0] = "kotlinTypePreparator";
                        break;
                    case 2:
                        objArr[0] = "customSubtype";
                        break;
                    case 3:
                    case 6:
                    default:
                        objArr[0] = "kotlinTypeRefiner";
                        break;
                    case 4:
                        objArr[0] = "equalityAxioms";
                        break;
                    case 5:
                        objArr[0] = "axioms";
                        break;
                    case 8:
                    case 9:
                        objArr[0] = "candidateSet";
                        break;
                    case 10:
                        objArr[0] = "transformFirst";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                        break;
                    case 13:
                        objArr[0] = "f";
                        break;
                    case 14:
                        objArr[0] = "g";
                        break;
                    case 15:
                    case 17:
                        objArr[0] = "descriptor";
                        break;
                    case 18:
                        objArr[0] = "result";
                        break;
                    case 19:
                    case 22:
                    case 28:
                    case 38:
                        objArr[0] = "superDescriptor";
                        break;
                    case 20:
                    case 23:
                    case 29:
                    case 39:
                        objArr[0] = "subDescriptor";
                        break;
                    case 40:
                        objArr[0] = "firstParameters";
                        break;
                    case 41:
                        objArr[0] = "secondParameters";
                        break;
                    case 44:
                        objArr[0] = "typeInSuper";
                        break;
                    case 45:
                        objArr[0] = "typeInSub";
                        break;
                    case 46:
                    case 49:
                    case 75:
                        objArr[0] = "typeCheckerState";
                        break;
                    case 47:
                        objArr[0] = "superTypeParameter";
                        break;
                    case 48:
                        objArr[0] = "subTypeParameter";
                        break;
                    case 50:
                        objArr[0] = "name";
                        break;
                    case 51:
                        objArr[0] = "membersFromSupertypes";
                        break;
                    case 52:
                        objArr[0] = "membersFromCurrent";
                        break;
                    case 53:
                    case 59:
                    case 62:
                    case 84:
                    case 87:
                    case 94:
                        objArr[0] = "current";
                        break;
                    case 54:
                    case 60:
                    case 64:
                    case 85:
                    case 104:
                        objArr[0] = "strategy";
                        break;
                    case 55:
                        objArr[0] = "overriding";
                        break;
                    case 56:
                        objArr[0] = "fromSuper";
                        break;
                    case 57:
                        objArr[0] = "fromCurrent";
                        break;
                    case 58:
                        objArr[0] = "descriptorsFromSuper";
                        break;
                    case 61:
                    case 63:
                        objArr[0] = "notOverridden";
                        break;
                    case 65:
                    case 67:
                    case 71:
                        objArr[0] = "a";
                        break;
                    case 66:
                    case 68:
                    case 73:
                        objArr[0] = "b";
                        break;
                    case 69:
                        objArr[0] = "candidate";
                        break;
                    case 70:
                    case 86:
                    case 91:
                    case 107:
                        objArr[0] = "descriptors";
                        break;
                    case 72:
                        objArr[0] = "aReturnType";
                        break;
                    case 74:
                        objArr[0] = "bReturnType";
                        break;
                    case 76:
                    case 83:
                        objArr[0] = "overridables";
                        break;
                    case 77:
                    case 99:
                        objArr[0] = "descriptorByHandle";
                        break;
                    case 92:
                        objArr[0] = "classModality";
                        break;
                    case 95:
                        objArr[0] = "toFilter";
                        break;
                    case 97:
                    case 102:
                        objArr[0] = "overrider";
                        break;
                    case 98:
                    case 103:
                        objArr[0] = "extractFrom";
                        break;
                    case 100:
                        objArr[0] = "onConflict";
                        break;
                    case 105:
                    case 106:
                        objArr[0] = "memberDescriptor";
                        break;
                }
                if (i != 11 || i == 12) {
                    objArr[1] = "filterOverrides";
                } else if (i != 16) {
                    if (i != 21) {
                        if (i == 93) {
                            objArr[1] = "getMinimalModality";
                        } else if (i == 96) {
                            objArr[1] = "filterVisibleFakeOverrides";
                        } else if (i == 101) {
                            objArr[1] = "extractMembersOverridableInBothWays";
                        } else if (i != 42 && i != 43) {
                            switch (i) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                    break;
                                default:
                                    switch (i) {
                                        case 30:
                                        case 31:
                                        case 32:
                                        case 33:
                                        case 34:
                                        case 35:
                                        case 36:
                                        case 37:
                                            objArr[1] = "isOverridableByWithoutExternalConditions";
                                            break;
                                        default:
                                            switch (i) {
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                    objArr[1] = "selectMostSpecificMember";
                                                    break;
                                                default:
                                                    switch (i) {
                                                        case 88:
                                                        case 89:
                                                        case 90:
                                                            objArr[1] = "determineModalityForFakeOverride";
                                                            break;
                                                        default:
                                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
                            objArr[1] = "createTypeCheckerState";
                        }
                    }
                    objArr[1] = "isOverridableBy";
                } else {
                    objArr[1] = "getOverriddenDeclarations";
                }
                switch (i) {
                    case 1:
                    case 2:
                        objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                        break;
                    case 3:
                    case 4:
                        objArr[2] = "create";
                        break;
                    case 5:
                    case 6:
                    case 7:
                        objArr[2] = "<init>";
                        break;
                    case 8:
                        objArr[2] = "filterOutOverridden";
                        break;
                    case 9:
                    case 10:
                        objArr[2] = "filterOverrides";
                        break;
                    case 11:
                    case 12:
                    case 16:
                    case 21:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 42:
                    case 43:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 82:
                    case 88:
                    case 89:
                    case 90:
                    case 93:
                    case 96:
                    case 101:
                        break;
                    case 13:
                    case 14:
                        objArr[2] = "overrides";
                        break;
                    case 15:
                        objArr[2] = "getOverriddenDeclarations";
                        break;
                    case 17:
                    case 18:
                        objArr[2] = "collectOverriddenDeclarations";
                        break;
                    case 19:
                    case 20:
                    case 22:
                    case 23:
                        objArr[2] = "isOverridableBy";
                        break;
                    case 28:
                    case 29:
                        objArr[2] = "isOverridableByWithoutExternalConditions";
                        break;
                    case 38:
                    case 39:
                        objArr[2] = "getBasicOverridabilityProblem";
                        break;
                    case 40:
                    case 41:
                        objArr[2] = "createTypeCheckerState";
                        break;
                    case 44:
                    case 45:
                    case 46:
                        objArr[2] = "areTypesEquivalent";
                        break;
                    case 47:
                    case 48:
                    case 49:
                        objArr[2] = "areTypeParametersEquivalent";
                        break;
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                        objArr[2] = "generateOverridesInFunctionGroup";
                        break;
                    case 55:
                    case 56:
                        objArr[2] = "isVisibleForOverride";
                        break;
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                        objArr[2] = "extractAndBindOverridesForMember";
                        break;
                    case 61:
                        objArr[2] = "allHasSameContainingDeclaration";
                        break;
                    case 62:
                    case 63:
                    case 64:
                        objArr[2] = "createAndBindFakeOverrides";
                        break;
                    case 65:
                    case 66:
                        objArr[2] = "isMoreSpecific";
                        break;
                    case 67:
                    case 68:
                        objArr[2] = "isVisibilityMoreSpecific";
                        break;
                    case 69:
                    case 70:
                        objArr[2] = "isMoreSpecificThenAllOf";
                        break;
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                        objArr[2] = "isReturnTypeMoreSpecific";
                        break;
                    case 76:
                    case 77:
                        objArr[2] = "selectMostSpecificMember";
                        break;
                    case 83:
                    case 84:
                    case 85:
                        objArr[2] = "createAndBindFakeOverride";
                        break;
                    case 86:
                    case 87:
                        objArr[2] = "determineModalityForFakeOverride";
                        break;
                    case 91:
                    case 92:
                        objArr[2] = "getMinimalModality";
                        break;
                    case 94:
                    case 95:
                        objArr[2] = "filterVisibleFakeOverrides";
                        break;
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 102:
                    case 103:
                    case 104:
                        objArr[2] = "extractMembersOverridableInBothWays";
                        break;
                    case 105:
                        objArr[2] = "resolveUnknownVisibilityForMember";
                        break;
                    case 106:
                        objArr[2] = "computeVisibilityToInherit";
                        break;
                    case 107:
                        objArr[2] = "findMaxVisibility";
                        break;
                    default:
                        objArr[2] = "createWithTypeRefiner";
                        break;
                }
                String format2 = String.format(str, objArr);
                if (i != 11 && i != 12 && i != 16 && i != 21 && i != 93 && i != 96 && i != 101 && i != 42 && i != 43) {
                    switch (i) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            switch (i) {
                                case 30:
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                case 35:
                                case 36:
                                case 37:
                                    break;
                                default:
                                    switch (i) {
                                        case 78:
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                            break;
                                        default:
                                            switch (i) {
                                                case 88:
                                                case 89:
                                                case 90:
                                                    break;
                                                default:
                                                    throw new IllegalArgumentException(format2);
                                            }
                                    }
                            }
                    }
                }
                throw new IllegalStateException(format2);
            }
            i2 = 2;
            objArr = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            String format22 = String.format(str, objArr);
            if (i != 11) {
                switch (i) {
                }
            }
            throw new IllegalStateException(format22);
        }
        str = "@NotNull method %s.%s must not return null";
        if (i != 11) {
            switch (i) {
            }
            objArr = new Object[i2];
            switch (i) {
            }
            if (i != 11) {
            }
            objArr[1] = "filterOverrides";
            switch (i) {
            }
            String format222 = String.format(str, objArr);
            if (i != 11) {
            }
            throw new IllegalStateException(format222);
        }
        i2 = 2;
        objArr = new Object[i2];
        switch (i) {
        }
        if (i != 11) {
        }
        objArr[1] = "filterOverrides";
        switch (i) {
        }
        String format2222 = String.format(str, objArr);
        if (i != 11) {
        }
        throw new IllegalStateException(format2222);
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        DEFAULT_TYPE_CONSTRUCTOR_EQUALITY = anonymousClass1;
        DEFAULT = new OverridingUtil(anonymousClass1, KotlinTypeRefiner.Default.INSTANCE, KotlinTypePreparator.Default.INSTANCE);
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality, KotlinTypeRefiner kotlinTypeRefiner, KotlinTypePreparator.Default r4) {
        if (typeConstructorEquality == null) {
            $$$reportNull$$$0(5);
            throw null;
        }
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(6);
            throw null;
        }
        if (r4 == null) {
            $$$reportNull$$$0(7);
            throw null;
        }
        this.equalityAxioms = typeConstructorEquality;
        this.kotlinTypeRefiner = kotlinTypeRefiner;
        this.kotlinTypePreparator = r4;
    }

    public static boolean areTypesEquivalent(KotlinType kotlinType, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            $$$reportNull$$$0(44);
            throw null;
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(45);
            throw null;
        }
        if (typeCheckerState == null) {
            $$$reportNull$$$0(46);
            throw null;
        }
        if (KotlinTypeKt.isError(kotlinType) && KotlinTypeKt.isError(kotlinType2)) {
            return true;
        }
        return AbstractTypeChecker.INSTANCE.equalTypes(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
    }

    public static void collectOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor, LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(17);
            throw null;
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            linkedHashSet.add(callableMemberDescriptor);
        } else {
            if (callableMemberDescriptor.getOverriddenDescriptors().isEmpty()) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(callableMemberDescriptor, "No overridden descriptors found for (fake override) ");
                return;
            }
            Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.getOverriddenDescriptors().iterator();
            while (it.hasNext()) {
                collectOverriddenDeclarations(it.next(), linkedHashSet);
            }
        }
    }

    public static ArrayList compiledValueParameters(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
        ArrayList arrayList = new ArrayList();
        if (extensionReceiverParameter != null) {
            arrayList.add(extensionReceiverParameter.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.getValueParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    public static OverridingUtil create(KotlinTypeRefiner kotlinTypeRefiner, KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        if (kotlinTypeRefiner == null) {
            $$$reportNull$$$0(3);
            throw null;
        }
        if (typeConstructorEquality != null) {
            return new OverridingUtil(typeConstructorEquality, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        $$$reportNull$$$0(4);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void createAndBindFakeOverride(Collection collection, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        Modality modality;
        if (collection == null) {
            $$$reportNull$$$0(83);
            throw null;
        }
        Collection<CallableMemberDescriptor> filterVisibleFakeOverrides = filterVisibleFakeOverrides(classDescriptor, collection);
        boolean isEmpty = filterVisibleFakeOverrides.isEmpty();
        Collection collection2 = isEmpty ? collection : filterVisibleFakeOverrides;
        Iterator it = collection2.iterator();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (it.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
                int i2 = AnonymousClass8.$SwitchMap$org$jetbrains$kotlin$descriptors$Modality[callableMemberDescriptor.getModality().ordinal()];
                if (i2 == 1) {
                    modality = Modality.FINAL;
                    if (modality == null) {
                        $$$reportNull$$$0(88);
                        throw null;
                    }
                } else if (i2 == 2) {
                    OptionalProvider$$ExternalSyntheticLambda0.m$1(callableMemberDescriptor, "Member cannot have SEALED modality: ");
                    return;
                } else if (i2 == 3) {
                    z = true;
                } else if (i2 == 4) {
                    z2 = true;
                }
            } else {
                boolean z3 = (!classDescriptor.isExpect() || classDescriptor.getModality() == Modality.ABSTRACT || classDescriptor.getModality() == Modality.SEALED) ? false : true;
                if (z && !z2) {
                    modality = Modality.OPEN;
                    if (modality == null) {
                        $$$reportNull$$$0(89);
                        throw null;
                    }
                } else if (z || !z2) {
                    HashSet hashSet = new HashSet();
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        hashSet.addAll(getOverriddenDeclarations((CallableMemberDescriptor) it2.next()));
                    }
                    Set<CallableMemberDescriptor> filterOutOverridden = filterOutOverridden(hashSet);
                    Modality modality2 = classDescriptor.getModality();
                    if (filterOutOverridden == null) {
                        $$$reportNull$$$0(91);
                        throw null;
                    }
                    if (modality2 == null) {
                        $$$reportNull$$$0(92);
                        throw null;
                    }
                    Modality modality3 = Modality.ABSTRACT;
                    for (CallableMemberDescriptor callableMemberDescriptor2 : filterOutOverridden) {
                        Modality modality4 = (z3 && callableMemberDescriptor2.getModality() == Modality.ABSTRACT) ? modality2 : callableMemberDescriptor2.getModality();
                        if (modality4.compareTo(modality3) < 0) {
                            modality3 = modality4;
                        }
                    }
                    if (modality3 == null) {
                        $$$reportNull$$$0(93);
                        throw null;
                    }
                    modality = modality3;
                } else {
                    modality = z3 ? classDescriptor.getModality() : Modality.ABSTRACT;
                    if (modality == null) {
                        $$$reportNull$$$0(90);
                        throw null;
                    }
                }
            }
        }
        CallableMemberDescriptor copy = ((CallableMemberDescriptor) selectMostSpecificMember(collection2, new AnonymousClass4(i))).copy(classDescriptor, modality, isEmpty ? DescriptorVisibilities.INVISIBLE_FAKE : DescriptorVisibilities.INHERITED, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        overridingStrategy.setOverriddenDescriptors(copy, collection2);
        overridingStrategy.addFakeOverride(copy);
    }

    public static OverridingUtil createWithTypeRefiner(KotlinTypeRefiner kotlinTypeRefiner) {
        if (kotlinTypeRefiner != null) {
            return new OverridingUtil(DEFAULT_TYPE_CONSTRUCTOR_EQUALITY, kotlinTypeRefiner, KotlinTypePreparator.Default.INSTANCE);
        }
        $$$reportNull$$$0(0);
        throw null;
    }

    public static <H> Collection<H> extractMembersOverridableInBothWays(H h, Collection<H> collection, Function1<H, CallableDescriptor> function1, Function1<H, Unit> function12) {
        if (h == null) {
            $$$reportNull$$$0(97);
            throw null;
        }
        if (collection == null) {
            $$$reportNull$$$0(98);
            throw null;
        }
        if (function1 == null) {
            $$$reportNull$$$0(99);
            throw null;
        }
        if (function12 == null) {
            $$$reportNull$$$0(100);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result bothWaysOverridability = getBothWaysOverridability(callableDescriptor, callableDescriptor2);
                if (bothWaysOverridability == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (bothWaysOverridability == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    public static <D extends CallableDescriptor> Set<D> filterOutOverridden(Set<D> set) {
        if (set != null) {
            return filterOverrides(set, !set.isEmpty() && DescriptorUtilsKt.isTypeRefinementEnabled(DescriptorUtilsKt.getModule(set.iterator().next())), null, new AnonymousClass2(0));
        }
        $$$reportNull$$$0(8);
        throw null;
    }

    public static <D> Set<D> filterOverrides(Set<D> set, boolean z, Function0<?> function0, Function2<? super D, ? super D, Pair<CallableDescriptor, CallableDescriptor>> function2) {
        if (set == null) {
            $$$reportNull$$$0(9);
            throw null;
        }
        if (function2 == null) {
            $$$reportNull$$$0(10);
            throw null;
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D d : set) {
            if (function0 != null) {
                function0.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(d);
                    break;
                }
                Pair pair = (Pair) function2.invoke(d, it.next());
                CallableDescriptor callableDescriptor = (CallableDescriptor) pair.first;
                CallableDescriptor callableDescriptor2 = (CallableDescriptor) pair.second;
                if (!overrides(callableDescriptor, callableDescriptor2, z, true)) {
                    if (overrides(callableDescriptor2, callableDescriptor, z, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<CallableMemberDescriptor> filterVisibleFakeOverrides(ClassDescriptor classDescriptor, Collection<CallableMemberDescriptor> collection) {
        if (classDescriptor == null) {
            $$$reportNull$$$0(94);
            throw null;
        }
        if (collection == null) {
            $$$reportNull$$$0(95);
            throw null;
        }
        collection.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) obj;
            boolean z = false;
            if (!DescriptorVisibilities.isPrivate(callableMemberDescriptor.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(callableMemberDescriptor, classDescriptor, false)) {
                z = true;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static DescriptorVisibility findMaxVisibility(Collection<? extends CallableMemberDescriptor> collection) {
        DescriptorVisibility descriptorVisibility;
        if (collection == null) {
            $$$reportNull$$$0(107);
            throw null;
        }
        if (collection.isEmpty()) {
            return DescriptorVisibilities.DEFAULT_VISIBILITY;
        }
        Iterator<? extends CallableMemberDescriptor> it = collection.iterator();
        loop0: while (true) {
            descriptorVisibility = null;
            while (it.hasNext()) {
                DescriptorVisibility visibility = it.next().getVisibility();
                if (descriptorVisibility != null) {
                    Integer compare = DescriptorVisibilities.compare(visibility, descriptorVisibility);
                    if (compare == null) {
                        break;
                    }
                    if (compare.intValue() > 0) {
                    }
                }
                descriptorVisibility = visibility;
            }
        }
        if (descriptorVisibility == null) {
            return null;
        }
        Iterator<? extends CallableMemberDescriptor> it2 = collection.iterator();
        while (it2.hasNext()) {
            Integer compare2 = DescriptorVisibilities.compare(descriptorVisibility, it2.next().getVisibility());
            if (compare2 == null || compare2.intValue() < 0) {
                return null;
            }
        }
        return descriptorVisibility;
    }

    public static OverrideCompatibilityInfo getBasicOverridabilityProblem(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        boolean z;
        if (callableDescriptor == null) {
            $$$reportNull$$$0(38);
            throw null;
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(39);
            throw null;
        }
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.incompatible("Member kind mismatch");
        }
        if (!z2 && !z) {
            OptionalProvider$$ExternalSyntheticLambda0.m((Object) callableDescriptor, "This type of CallableDescriptor cannot be checked for overridability: ");
            return null;
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.incompatible("Name mismatch");
        }
        OverrideCompatibilityInfo incompatible = (callableDescriptor.getExtensionReceiverParameter() == null) != (callableDescriptor2.getExtensionReceiverParameter() == null) ? OverrideCompatibilityInfo.incompatible("Receiver presence mismatch") : callableDescriptor.getValueParameters().size() != callableDescriptor2.getValueParameters().size() ? OverrideCompatibilityInfo.incompatible("Value parameter number mismatch") : null;
        if (incompatible != null) {
            return incompatible;
        }
        return null;
    }

    public static OverrideCompatibilityInfo.Result getBothWaysOverridability(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = DEFAULT;
        OverrideCompatibilityInfo.Result result = overridingUtil.isOverridableBy(callableDescriptor2, callableDescriptor, null).getResult();
        OverrideCompatibilityInfo.Result result2 = overridingUtil.isOverridableBy(callableDescriptor, callableDescriptor2, null).getResult();
        OverrideCompatibilityInfo.Result result3 = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        OverrideCompatibilityInfo.Result result4 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (result == result4 || result2 == result4) ? result4 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    public static Set<CallableMemberDescriptor> getOverriddenDeclarations(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(15);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        collectOverriddenDeclarations(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    public static boolean isMoreSpecific(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(65);
            throw null;
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(66);
            throw null;
        }
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (isVisibilityMoreSpecific(callableDescriptor, callableDescriptor2)) {
            TypeCheckerState createTypeCheckerState = DEFAULT.createTypeCheckerState(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters());
            if (callableDescriptor instanceof FunctionDescriptor) {
                return isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2, createTypeCheckerState);
            }
            if (!(callableDescriptor instanceof PropertyDescriptor)) {
                Path$$ExternalSyntheticBUOutline0.m(callableDescriptor.getClass(), "Unexpected callable: ");
                return false;
            }
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
            PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
            if ((setter == null || setter2 == null) ? true : isVisibilityMoreSpecific(setter, setter2)) {
                if (propertyDescriptor.isVar() && propertyDescriptor2.isVar()) {
                    return AbstractTypeChecker.INSTANCE.equalTypes(createTypeCheckerState, returnType.unwrap(), returnType2.unwrap());
                }
                if ((propertyDescriptor.isVar() || !propertyDescriptor2.isVar()) && isReturnTypeMoreSpecific(callableDescriptor, returnType, callableDescriptor2, returnType2, createTypeCheckerState)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isReturnTypeMoreSpecific(CallableDescriptor callableDescriptor, KotlinType kotlinType, CallableDescriptor callableDescriptor2, KotlinType kotlinType2, TypeCheckerState typeCheckerState) {
        if (kotlinType == null) {
            $$$reportNull$$$0(72);
            throw null;
        }
        if (kotlinType2 == null) {
            $$$reportNull$$$0(74);
            throw null;
        }
        if (typeCheckerState != null) {
            return AbstractTypeChecker.INSTANCE.isSubtypeOf(typeCheckerState, kotlinType.unwrap(), kotlinType2.unwrap());
        }
        $$$reportNull$$$0(75);
        throw null;
    }

    public static boolean isVisibilityMoreSpecific(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(67);
            throw null;
        }
        if (callableDescriptor2 != null) {
            Integer compare = DescriptorVisibilities.compare(callableDescriptor.getVisibility(), callableDescriptor2.getVisibility());
            return compare == null || compare.intValue() >= 0;
        }
        $$$reportNull$$$0(68);
        throw null;
    }

    public static boolean isVisibleForOverride(MemberDescriptor memberDescriptor, MemberDescriptor memberDescriptor2, boolean z) {
        if (memberDescriptor == null) {
            $$$reportNull$$$0(55);
            throw null;
        }
        if (memberDescriptor2 != null) {
            return !DescriptorVisibilities.isPrivate(memberDescriptor2.getVisibility()) && DescriptorVisibilities.isVisibleIgnoringReceiver(memberDescriptor2, memberDescriptor, z);
        }
        $$$reportNull$$$0(56);
        throw null;
    }

    public static <D extends CallableDescriptor> boolean overrides(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            $$$reportNull$$$0(13);
            throw null;
        }
        if (d2 == null) {
            $$$reportNull$$$0(14);
            throw null;
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(d.getOriginal(), d2.getOriginal(), z, z2)) {
            return true;
        }
        CallableDescriptor original = d2.getOriginal();
        Iterator it = DescriptorUtils.getAllOverriddenDescriptors(d).iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.INSTANCE.areEquivalent(original, (CallableDescriptor) it.next(), z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void resolveUnknownVisibilityForMember(CallableMemberDescriptor callableMemberDescriptor, Function1<CallableMemberDescriptor, Unit> function1) {
        DescriptorVisibility descriptorVisibility;
        if (callableMemberDescriptor == null) {
            $$$reportNull$$$0(105);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.getOverriddenDescriptors()) {
            if (callableMemberDescriptor2.getVisibility() == DescriptorVisibilities.INHERITED) {
                resolveUnknownVisibilityForMember(callableMemberDescriptor2, function1);
            }
        }
        if (callableMemberDescriptor.getVisibility() != DescriptorVisibilities.INHERITED) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        DescriptorVisibility findMaxVisibility = findMaxVisibility(overriddenDescriptors);
        if (findMaxVisibility != null) {
            if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                for (CallableMemberDescriptor callableMemberDescriptor3 : overriddenDescriptors) {
                    if (callableMemberDescriptor3.getModality() == Modality.ABSTRACT || callableMemberDescriptor3.getVisibility().equals(findMaxVisibility)) {
                    }
                }
            } else {
                findMaxVisibility = findMaxVisibility.normalize();
            }
            if (findMaxVisibility != null) {
                if (function1 != null) {
                    function1.invoke(callableMemberDescriptor);
                }
                descriptorVisibility = DescriptorVisibilities.PUBLIC;
            } else {
                descriptorVisibility = findMaxVisibility;
            }
            if (!(callableMemberDescriptor instanceof PropertyDescriptorImpl)) {
                ((PropertyDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
                Iterator<PropertyAccessorDescriptor> it = ((PropertyDescriptor) callableMemberDescriptor).getAccessors().iterator();
                while (it.hasNext()) {
                    resolveUnknownVisibilityForMember(it.next(), findMaxVisibility == null ? null : function1);
                }
                return;
            }
            if (callableMemberDescriptor instanceof FunctionDescriptorImpl) {
                ((FunctionDescriptorImpl) callableMemberDescriptor).setVisibility(descriptorVisibility);
                return;
            }
            PropertyAccessorDescriptorImpl propertyAccessorDescriptorImpl = (PropertyAccessorDescriptorImpl) callableMemberDescriptor;
            propertyAccessorDescriptorImpl.setVisibility(descriptorVisibility);
            if (descriptorVisibility != propertyAccessorDescriptorImpl.getCorrespondingProperty().getVisibility()) {
                propertyAccessorDescriptorImpl.setDefault(false);
                return;
            }
            return;
        }
        findMaxVisibility = null;
        if (findMaxVisibility != null) {
        }
        if (!(callableMemberDescriptor instanceof PropertyDescriptorImpl)) {
        }
    }

    public static <H> H selectMostSpecificMember(Collection<H> collection, Function1<H, CallableDescriptor> function1) {
        H h;
        if (collection == null) {
            $$$reportNull$$$0(76);
            throw null;
        }
        if (function1 == null) {
            $$$reportNull$$$0(77);
            throw null;
        }
        if (collection.size() == 1) {
            H h2 = (H) CollectionsKt.first(collection);
            if (h2 != null) {
                return h2;
            }
            $$$reportNull$$$0(78);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        function1.getClass();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(function1.invoke(it.next()));
        }
        H h3 = (H) CollectionsKt.first(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h3);
        for (H h4 : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(h4);
            if (callableDescriptor2 == null) {
                $$$reportNull$$$0(69);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(h4);
                    break;
                }
                if (!isMoreSpecific(callableDescriptor2, (CallableDescriptor) it2.next())) {
                    break;
                }
            }
            if (isMoreSpecific(callableDescriptor2, callableDescriptor) && !isMoreSpecific(callableDescriptor, callableDescriptor2)) {
                h3 = h4;
            }
        }
        if (arrayList.isEmpty()) {
            if (h3 != null) {
                return h3;
            }
            $$$reportNull$$$0(79);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h5 = (H) CollectionsKt.first((Iterable) arrayList);
            if (h5 != null) {
                return h5;
            }
            $$$reportNull$$$0(80);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                h = null;
                break;
            }
            h = (H) it3.next();
            if (!FlexibleTypesKt.isFlexible(((CallableDescriptor) function1.invoke(h)).getReturnType())) {
                break;
            }
        }
        if (h != null) {
            return h;
        }
        H h6 = (H) CollectionsKt.first((Iterable) arrayList);
        if (h6 != null) {
            return h6;
        }
        $$$reportNull$$$0(82);
        throw null;
    }

    public final TypeCheckerState createTypeCheckerState(List list, List list2) {
        if (list == null) {
            $$$reportNull$$$0(40);
            throw null;
        }
        if (list2 == null) {
            $$$reportNull$$$0(41);
            throw null;
        }
        if (list.isEmpty()) {
            TypeCheckerState newTypeCheckerState = new OverridingUtilTypeSystemContext(null, this.equalityAxioms, this.kotlinTypeRefiner, this.kotlinTypePreparator, null).newTypeCheckerState(true, true, false);
            if (newTypeCheckerState != null) {
                return newTypeCheckerState;
            }
            $$$reportNull$$$0(42);
            throw null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((TypeParameterDescriptor) list.get(i)).getTypeConstructor(), ((TypeParameterDescriptor) list2.get(i)).getTypeConstructor());
        }
        TypeCheckerState newTypeCheckerState2 = new OverridingUtilTypeSystemContext(hashMap, this.equalityAxioms, this.kotlinTypeRefiner, this.kotlinTypePreparator, null).newTypeCheckerState(true, true, false);
        if (newTypeCheckerState2 != null) {
            return newTypeCheckerState2;
        }
        $$$reportNull$$$0(43);
        throw null;
    }

    public void generateOverridesInFunctionGroup(Name name, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, ClassDescriptor classDescriptor, OverridingStrategy overridingStrategy) {
        if (name == null) {
            $$$reportNull$$$0(50);
            throw null;
        }
        if (collection == null) {
            $$$reportNull$$$0(51);
            throw null;
        }
        if (collection2 == null) {
            $$$reportNull$$$0(52);
            throw null;
        }
        if (classDescriptor == null) {
            $$$reportNull$$$0(53);
            throw null;
        }
        if (overridingStrategy == null) {
            $$$reportNull$$$0(54);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends CallableMemberDescriptor> it = collection2.iterator();
        while (true) {
            int i = 0;
            int i2 = 2;
            if (!it.hasNext()) {
                if (linkedHashSet.size() >= 2) {
                    DeclarationDescriptor containingDeclaration = ((CallableMemberDescriptor) linkedHashSet.iterator().next()).getContainingDeclaration();
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it2 = linkedHashSet.iterator();
                        while (it2.hasNext()) {
                            if (((CallableMemberDescriptor) it2.next()).getContainingDeclaration() != containingDeclaration) {
                                LinkedList linkedList = new LinkedList(linkedHashSet);
                                while (!linkedList.isEmpty()) {
                                    CallableMemberDescriptor findMemberWithMaxVisibility = VisibilityUtilKt.findMemberWithMaxVisibility(linkedList);
                                    if (findMemberWithMaxVisibility == null) {
                                        $$$reportNull$$$0(102);
                                        throw null;
                                    }
                                    createAndBindFakeOverride(extractMembersOverridableInBothWays(findMemberWithMaxVisibility, linkedList, new AnonymousClass4(i2), new AnonymousClass7(i, overridingStrategy, findMemberWithMaxVisibility)), classDescriptor, overridingStrategy);
                                }
                                return;
                            }
                        }
                    }
                }
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    createAndBindFakeOverride(Collections.singleton((CallableMemberDescriptor) it3.next()), classDescriptor, overridingStrategy);
                }
                return;
            }
            CallableMemberDescriptor next = it.next();
            if (next == null) {
                $$$reportNull$$$0(57);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            SmartSet create = SmartSet.create();
            for (CallableMemberDescriptor callableMemberDescriptor : collection) {
                OverrideCompatibilityInfo.Result result = isOverridableBy(callableMemberDescriptor, next, classDescriptor).getResult();
                boolean isVisibleForOverride = isVisibleForOverride(next, callableMemberDescriptor, false);
                int i3 = AnonymousClass8.$SwitchMap$org$jetbrains$kotlin$resolve$OverridingUtil$OverrideCompatibilityInfo$Result[result.ordinal()];
                if (i3 == 1) {
                    if (isVisibleForOverride) {
                        create.add(callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor);
                } else if (i3 == 2) {
                    if (isVisibleForOverride) {
                        overridingStrategy.overrideConflict(callableMemberDescriptor, next);
                    }
                    arrayList.add(callableMemberDescriptor);
                }
            }
            overridingStrategy.setOverriddenDescriptors(next, create);
            linkedHashSet.removeAll(arrayList);
        }
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(22);
            throw null;
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(23);
            throw null;
        }
        OverrideCompatibilityInfo isOverridableByWithoutExternalConditions = isOverridableByWithoutExternalConditions(callableDescriptor, callableDescriptor2, z);
        boolean z2 = isOverridableByWithoutExternalConditions.getResult() == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        List<ExternalOverridabilityCondition> list = EXTERNAL_CONDITIONS;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
            if (externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || externalOverridabilityCondition.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = AnonymousClass8.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible != null) {
                        return incompatible;
                    }
                    $$$reportNull$$$0(24);
                    throw null;
                }
            }
        }
        if (!z2) {
            return isOverridableByWithoutExternalConditions;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : list) {
            if (externalOverridabilityCondition2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = AnonymousClass8.$SwitchMap$org$jetbrains$kotlin$resolve$ExternalOverridabilityCondition$Result[externalOverridabilityCondition2.isOverridable(callableDescriptor, callableDescriptor2, classDescriptor).ordinal()];
                if (i2 == 1) {
                    f$$ExternalSyntheticLambda0.m("Contract violation in ", externalOverridabilityCondition2.getClass().getName(), " condition. It's not supposed to end with success");
                    return null;
                }
                if (i2 == 2) {
                    OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible("External condition");
                    if (incompatible2 != null) {
                        return incompatible2;
                    }
                    $$$reportNull$$$0(26);
                    throw null;
                }
            }
        }
        OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
        if (success != null) {
            return success;
        }
        $$$reportNull$$$0(27);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        r10.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OverrideCompatibilityInfo isOverridableByWithoutExternalConditions(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, boolean z) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(28);
            throw null;
        }
        if (callableDescriptor2 == null) {
            $$$reportNull$$$0(29);
            throw null;
        }
        OverrideCompatibilityInfo basicOverridabilityProblem = getBasicOverridabilityProblem(callableDescriptor, callableDescriptor2);
        if (basicOverridabilityProblem != null) {
            return basicOverridabilityProblem;
        }
        ArrayList compiledValueParameters = compiledValueParameters(callableDescriptor);
        ArrayList compiledValueParameters2 = compiledValueParameters(callableDescriptor2);
        List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
        List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < compiledValueParameters.size()) {
                if (!KotlinTypeChecker.DEFAULT.equalTypes((KotlinType) compiledValueParameters.get(i), (KotlinType) compiledValueParameters2.get(i))) {
                    OverrideCompatibilityInfo incompatible = OverrideCompatibilityInfo.incompatible("Type parameter number mismatch");
                    if (incompatible != null) {
                        return incompatible;
                    }
                    $$$reportNull$$$0(31);
                    throw null;
                }
                i++;
            }
            OverrideCompatibilityInfo conflict = OverrideCompatibilityInfo.conflict("Type parameter number mismatch");
            if (conflict != null) {
                return conflict;
            }
            $$$reportNull$$$0(32);
            throw null;
        }
        TypeCheckerState createTypeCheckerState = createTypeCheckerState(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = typeParameters.get(i2);
            TypeParameterDescriptor typeParameterDescriptor2 = typeParameters2.get(i2);
            if (typeParameterDescriptor == null) {
                $$$reportNull$$$0(47);
                throw null;
            }
            if (typeParameterDescriptor2 == null) {
                $$$reportNull$$$0(48);
                throw null;
            }
            List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
            ArrayList arrayList = new ArrayList(typeParameterDescriptor2.getUpperBounds());
            if (upperBounds.size() == arrayList.size()) {
                for (KotlinType kotlinType : upperBounds) {
                    ListIterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (areTypesEquivalent(kotlinType, (KotlinType) listIterator.next(), createTypeCheckerState)) {
                            break;
                        }
                    }
                }
            }
            OverrideCompatibilityInfo incompatible2 = OverrideCompatibilityInfo.incompatible("Type parameter bounds mismatch");
            if (incompatible2 != null) {
                return incompatible2;
            }
            $$$reportNull$$$0(33);
            throw null;
        }
        while (i < compiledValueParameters.size()) {
            if (!areTypesEquivalent((KotlinType) compiledValueParameters.get(i), (KotlinType) compiledValueParameters2.get(i), createTypeCheckerState)) {
                OverrideCompatibilityInfo incompatible3 = OverrideCompatibilityInfo.incompatible("Value parameter type mismatch");
                if (incompatible3 != null) {
                    return incompatible3;
                }
                $$$reportNull$$$0(34);
                throw null;
            }
            i++;
        }
        if ((callableDescriptor instanceof FunctionDescriptor) && (callableDescriptor2 instanceof FunctionDescriptor) && ((FunctionDescriptor) callableDescriptor).isSuspend() != ((FunctionDescriptor) callableDescriptor2).isSuspend()) {
            OverrideCompatibilityInfo conflict2 = OverrideCompatibilityInfo.conflict("Incompatible suspendability");
            if (conflict2 != null) {
                return conflict2;
            }
            $$$reportNull$$$0(35);
            throw null;
        }
        if (z) {
            KotlinType returnType = callableDescriptor.getReturnType();
            KotlinType returnType2 = callableDescriptor2.getReturnType();
            if (returnType != null && returnType2 != null && ((!KotlinTypeKt.isError(returnType2) || !KotlinTypeKt.isError(returnType)) && !AbstractTypeChecker.INSTANCE.isSubtypeOf(createTypeCheckerState, returnType2.unwrap(), returnType.unwrap()))) {
                OverrideCompatibilityInfo conflict3 = OverrideCompatibilityInfo.conflict("Return type mismatch");
                if (conflict3 != null) {
                    return conflict3;
                }
                $$$reportNull$$$0(36);
                throw null;
            }
        }
        OverrideCompatibilityInfo success = OverrideCompatibilityInfo.success();
        if (success != null) {
            return success;
        }
        $$$reportNull$$$0(37);
        throw null;
    }

    public OverrideCompatibilityInfo isOverridableBy(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2, ClassDescriptor classDescriptor) {
        if (callableDescriptor == null) {
            $$$reportNull$$$0(19);
            throw null;
        }
        if (callableDescriptor2 != null) {
            OverrideCompatibilityInfo isOverridableBy = isOverridableBy(callableDescriptor, callableDescriptor2, classDescriptor, false);
            if (isOverridableBy != null) {
                return isOverridableBy;
            }
            $$$reportNull$$$0(21);
            throw null;
        }
        $$$reportNull$$$0(20);
        throw null;
    }
}
