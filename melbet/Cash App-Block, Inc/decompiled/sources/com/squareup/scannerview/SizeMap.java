package com.squareup.scannerview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.widget.FocusStrategy;
import androidx.emoji2.text.MetadataRepo;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.media3.muxer.MuxerUtil;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.RectEvaluator;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.zipline.loader.OkHttpZiplineHttpClient$download$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.qg$$ExternalSyntheticLambda0;
import coil3.request.ErrorResult;
import coil3.request.ImageRequest;
import coil3.request.SuccessResult;
import com.fillr.browsersdk.utilities.Obfuscator;
import com.fillr.n;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzru;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.FadeThroughUpdateListener;
import com.google.android.material.internal.MultiViewUpdateListener;
import com.google.android.material.internal.ReversableAnimatedValueInterpolator;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.material.search.SearchViewAnimationHelper;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.play.core.splitcompat.zzl;
import com.google.android.play.core.splitcompat.zzm;
import com.google.common.base.Joiner;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.concurrent.DelegatingScheduledFuture;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import com.google.mlkit.vision.barcode.internal.zzb;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.knotapi.knot.ui.views.KnotSpinnerView$$ExternalSyntheticLambda3;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.jca.JCAContext;
import com.nimbusds.jose.util.IntegerOverflowException;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.PaymentHistoryActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.advertising.views.FullscreenAdView;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.card.onboarding.graphics.BumpNoisePBRMaterial;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.clientsync.EntitySyncerKt;
import com.squareup.cash.deposits.physical.backend.api.retailer.AtmRetailerLocationManager$Result;
import com.squareup.cash.deposits.physical.backend.real.retailer.RealAtmRetailerLocationManager$retailersNearLocation$1;
import com.squareup.cash.discover.promotiondetails.backend.real.RealTreehouseDetailsPageProvider$getDetailsPage$1;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.graphics.swampgl.components.Material;
import com.squareup.cash.graphics.swampgl.components.MaterialInput;
import com.squareup.cash.graphics.swampgl.components.MaterialPlugin;
import com.squareup.cash.graphics.swampgl.components.RealUniformBinder;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Args;
import com.squareup.cash.instruments.backend.api.BankAccountLinker$Result;
import com.squareup.cash.instruments.backend.real.RealBankAccountLinker$link$1;
import com.squareup.cash.lynx.api.v1_0.model.InstrumentType;
import com.squareup.cash.moneybot.components.api.ClientRenderableUi;
import com.squareup.cash.moneybot.viewmodels.plugins.GenieCardViewModel;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.shopping.backend.api.SearchQuery;
import com.squareup.cash.shopping.backend.api.SearchResults;
import com.squareup.cash.shopping.backend.real.RealBrandsSearchRepository$search$1;
import com.squareup.cash.taptopay.encryption.real.utils.EcrKeyType;
import com.squareup.cash.transfers.backend.real.RealCashOutCapabilityManager$WhenMappings;
import com.squareup.cash.treehouse.discover.HostDiscoverDataBridge;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.cash.customersearch.api.CustomerSearchClientService;
import com.squareup.protos.cash.customersearch.api.SearchCommonSection;
import com.squareup.protos.cash.customersearch.api.ShopSearchBrandsRequest;
import com.squareup.protos.cash.customersearch.api.ShopSearchBrandsResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsRequest$Query$LatLongQuery;
import com.squareup.protos.cash.moneymap.app.GetRetailerLocationsResponse;
import com.squareup.protos.cash.moneymap.app.MoneymapAppService;
import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.LinkBankAccountRequest;
import com.squareup.protos.franklin.app.LinkBankAccountResponse;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.scannerview.SizeMap;
import com.squareup.util.android.ToastKt;
import com.squareup.wire.OneOf;
import com.squareup.wire.ProtoAdapter;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Function;
import kotlin.LazyKt;
import kotlin.UnsignedKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.TypesJVMKt;
import kotlin.text.Regex;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.internal.connection.RealCall;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.brotli.dec.HuffmanTreeGroup;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class SizeMap implements SearchViewAnimationHelper.AnimationDelegate, OnApplyWindowInsetsListener, zzl, zzwo, BarcodeSource, OnSuccessListener, ImageRequest.Listener, MaterialPlugin, ClientRenderableUi, ActivityItemEventDecorator {
    public final /* synthetic */ int $r8$classId;
    public Object mRatios;

    public SizeMap(EcrKeyType ecrKeyType) {
        this.$r8$classId = 28;
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        int ordinal = ecrKeyType.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerVector(1, 0));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(2, 32));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(3, 128));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerVector(4, 1, 2, 32));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerVector(6, 1, 64));
            if (ecrKeyType == EcrKeyType.AES_KEY_WITH_MIN_MAC) {
                aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(8, 128));
            }
        } else {
            if (ordinal != 2 && ordinal != 3) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerVector(1, 2));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(2, 128));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(3, 256));
            aSN1EncodableVector.add(MuxerUtil.taggedIntegerVector(5, 4));
            if (ecrKeyType == EcrKeyType.HMAC_KEY_WITH_MIN_MAC) {
                aSN1EncodableVector.add(MuxerUtil.taggedIntegerValue(8, 256));
            }
        }
        aSN1EncodableVector.add(new DERTaggedObject(true, 503, (ASN1Encodable) DERNull.INSTANCE));
        DERSequence dERSequence = new DERSequence(aSN1EncodableVector);
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        aSN1EncodableVector2.add(new ASN1Integer(3L));
        aSN1EncodableVector2.add(dERSequence);
        this.mRatios = new DERSequence(aSN1EncodableVector2);
    }

    public static CashInstrumentType asCashInstrumentType(InstrumentType instrumentType) {
        int i = instrumentType == null ? -1 : RealCashOutCapabilityManager$WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
        if (i == 1) {
            return CashInstrumentType.DEBIT_CARD;
        }
        if (i == 2) {
            return CashInstrumentType.BANK_ACCOUNT;
        }
        if (i == 3) {
            return CashInstrumentType.CREDIT_CARD;
        }
        OptionalProvider$$ExternalSyntheticLambda0.m((Object) instrumentType, "Unknown instrument type: ");
        return null;
    }

    public static byte[] encodeDataWithLength(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        return OneOf.concat(TypesJVMKt.toBytes(bArr.length), bArr);
    }

    public static AnimatorSet getTranslationAnimator(boolean z, View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(i, RecyclerView.DECELERATION_RATE);
        ofFloat.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(2), new View[]{view}));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i2, RecyclerView.DECELERATION_RATE);
        ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    public void Content(GenieCardViewModel genieCardViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(302007742);
        int i2 = (gapComposer.changedInstance(genieCardViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(this) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 131) != 130)) {
            TextCardKt.GenieCard(genieCardViewModel, (GenieLogger) this.mRatios, null, gapComposer, i2 & 14);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) this, (Object) genieCardViewModel, (Function) function1, i, 4);
        }
    }

    public void add(Size size) {
        int i = size.height;
        int i2 = size.width;
        ArrayMap arrayMap = (ArrayMap) this.mRatios;
        Iterator it = ((ArrayMap.KeySet) arrayMap.keySet()).iterator();
        while (it.hasNext()) {
            AspectRatio aspectRatio = (AspectRatio) it.next();
            aspectRatio.getClass();
            SparseArrayCompat sparseArrayCompat = AspectRatio.sCache;
            int i3 = i;
            int i4 = i2;
            while (i3 != 0) {
                int i5 = i4 % i3;
                i4 = i3;
                i3 = i5;
            }
            int i6 = i2 / i4;
            int i7 = i / i4;
            if (aspectRatio.x == i6 && aspectRatio.y == i7) {
                Object obj = arrayMap.get(aspectRatio);
                obj.getClass();
                SortedSet sortedSet = (SortedSet) obj;
                if (sortedSet.contains(size)) {
                    return;
                }
                sortedSet.add(size);
                return;
            }
        }
        SparseArrayCompat sparseArrayCompat2 = AspectRatio.sCache;
        AspectRatio of = EntitySyncerKt.of(i2, i);
        TreeSet treeSet = new TreeSet();
        treeSet.add(size);
        arrayMap.put(of, treeSet);
    }

    public void appendTo(StringBuilder sb, Iterator it) {
        Joiner joiner = (Joiner) this.mRatios;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(Joiner.toString(entry.getKey()));
            sb.append("=");
            sb.append(Joiner.toString(entry.getValue()));
            while (it.hasNext()) {
                sb.append((CharSequence) joiner.separator);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(Joiner.toString(entry2.getKey()));
                sb.append("=");
                sb.append(Joiner.toString(entry2.getValue()));
            }
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void bindCustomUniforms(RealUniformBinder realUniformBinder) {
        ((BumpNoisePBRMaterial) this.mRatios).bindWandLightingUniforms(realUniformBinder);
        realUniformBinder.setFloat("uBumpScale", ((BumpNoisePBRMaterial) this.mRatios).bumpScale);
        realUniformBinder.setFloat("uBumpStrength", ((BumpNoisePBRMaterial) this.mRatios).bumpStrength);
        realUniformBinder.setInt(((BumpNoisePBRMaterial) this.mRatios).bumpOctaves, "uBumpOctaves");
    }

    public MessagingClientEventExtension build() {
        return new MessagingClientEventExtension((MessagingClientEvent) this.mRatios);
    }

    public int decodeWithECCount(int i, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i2;
        int i3;
        GenericGF genericGF = (GenericGF) this.mRatios;
        if (iArr.length == 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return 0;
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i4 = 1;
            while (i4 < length && iArr[i4] == 0) {
                i4++;
            }
            if (i4 == length) {
                iArr2 = new int[]{0};
            } else {
                int i5 = length - i4;
                int[] iArr4 = new int[i5];
                System.arraycopy(iArr, i4, iArr4, 0, i5);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        boolean z = true;
        for (int i6 = 0; i6 < i; i6++) {
            int i7 = genericGF.expTable[genericGF.generatorBase + i6];
            if (i7 == 0) {
                i3 = iArr2[iArr2.length - 1];
            } else {
                if (i7 == 1) {
                    i2 = 0;
                    for (int i8 : iArr2) {
                        GenericGF genericGF2 = GenericGF.QR_CODE_FIELD_256;
                        i2 ^= i8;
                    }
                } else {
                    i2 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i9 = 1; i9 < length2; i9++) {
                        i2 = genericGF.multiply(i7, i2) ^ iArr2[i9];
                    }
                }
                i3 = i2;
            }
            iArr5[(i - 1) - i6] = i3;
            if (i3 != 0) {
                z = false;
            }
        }
        if (z) {
            return 0;
        }
        GenericGFPoly genericGFPoly = new GenericGFPoly(genericGF, iArr5);
        GenericGFPoly buildMonomial = genericGF.buildMonomial(i, 1);
        GenericGFPoly genericGFPoly2 = genericGF.zero;
        if (buildMonomial.getDegree() >= genericGFPoly.getDegree()) {
            buildMonomial = genericGFPoly;
            genericGFPoly = buildMonomial;
        }
        GenericGFPoly genericGFPoly3 = genericGF.one;
        GenericGFPoly genericGFPoly4 = buildMonomial;
        GenericGFPoly genericGFPoly5 = genericGFPoly;
        GenericGFPoly genericGFPoly6 = genericGFPoly4;
        GenericGFPoly genericGFPoly7 = genericGFPoly2;
        while (genericGFPoly6.getDegree() * 2 >= i) {
            if (genericGFPoly6.isZero()) {
                throw new ReedSolomonException("r_{i-1} was zero");
            }
            int inverse = genericGF.inverse(genericGFPoly6.getCoefficient(genericGFPoly6.getDegree()));
            GenericGFPoly genericGFPoly8 = genericGFPoly2;
            while (genericGFPoly5.getDegree() >= genericGFPoly6.getDegree() && !genericGFPoly5.isZero()) {
                int degree = genericGFPoly5.getDegree() - genericGFPoly6.getDegree();
                int multiply = genericGF.multiply(genericGFPoly5.getCoefficient(genericGFPoly5.getDegree()), inverse);
                genericGFPoly8 = genericGFPoly8.addOrSubtract(genericGF.buildMonomial(degree, multiply));
                genericGFPoly5 = genericGFPoly5.addOrSubtract(genericGFPoly6.multiplyByMonomial(degree, multiply));
            }
            GenericGFPoly addOrSubtract = genericGFPoly8.multiply(genericGFPoly3).addOrSubtract(genericGFPoly7);
            if (genericGFPoly5.getDegree() >= genericGFPoly6.getDegree()) {
                Drop$$ExternalSyntheticBUOutline0.m("Division algorithm failed to reduce polynomial? r: ", genericGFPoly5, ", rLast: ", genericGFPoly6);
                return 0;
            }
            GenericGFPoly genericGFPoly9 = genericGFPoly5;
            genericGFPoly5 = genericGFPoly6;
            genericGFPoly6 = genericGFPoly9;
            genericGFPoly7 = genericGFPoly3;
            genericGFPoly3 = addOrSubtract;
        }
        int coefficient = genericGFPoly3.getCoefficient(0);
        if (coefficient == 0) {
            throw new ReedSolomonException("sigmaTilde(0) was zero");
        }
        int inverse2 = genericGF.inverse(coefficient);
        GenericGFPoly[] genericGFPolyArr = {genericGFPoly3.multiply(inverse2), genericGFPoly6.multiply(inverse2)};
        GenericGFPoly genericGFPoly10 = genericGFPolyArr[0];
        GenericGFPoly genericGFPoly11 = genericGFPolyArr[1];
        int degree2 = genericGFPoly10.getDegree();
        if (degree2 == 1) {
            iArr3 = new int[]{genericGFPoly10.getCoefficient(1)};
        } else {
            int[] iArr6 = new int[degree2];
            int i10 = 0;
            for (int i11 = 1; i11 < genericGF.size && i10 < degree2; i11++) {
                if (genericGFPoly10.evaluateAt(i11) == 0) {
                    iArr6[i10] = genericGF.inverse(i11);
                    i10++;
                }
            }
            if (i10 != degree2) {
                throw new ReedSolomonException("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            int inverse3 = genericGF.inverse(iArr3[i12]);
            int i13 = 1;
            for (int i14 = 0; i14 < length3; i14++) {
                if (i12 != i14) {
                    int multiply2 = genericGF.multiply(iArr3[i14], inverse3);
                    i13 = genericGF.multiply(i13, (multiply2 & 1) == 0 ? multiply2 | 1 : multiply2 & (-2));
                }
            }
            int multiply3 = genericGF.multiply(genericGFPoly11.evaluateAt(inverse3), genericGF.inverse(i13));
            iArr7[i12] = multiply3;
            if (genericGF.generatorBase != 0) {
                iArr7[i12] = genericGF.multiply(multiply3, inverse3);
            }
        }
        for (int i15 = 0; i15 < iArr3.length; i15++) {
            int length4 = iArr.length - 1;
            int i16 = iArr3[i15];
            if (i16 == 0) {
                Path$$ExternalSyntheticBUOutline0.m$3();
                return 0;
            }
            int i17 = length4 - genericGF.logTable[i16];
            if (i17 < 0) {
                throw new ReedSolomonException("Bad error location");
            }
            iArr[i17] = iArr[i17] ^ iArr7[i15];
        }
        return iArr3.length;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        if (!activityItemViewEvent.equals(ActivityItemViewEvent.ItemClicked.INSTANCE)) {
            return activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem);
        }
        PaymentHistoryActivityItem paymentHistoryActivityItem = activityItem instanceof PaymentHistoryActivityItem ? (PaymentHistoryActivityItem) activityItem : null;
        if (paymentHistoryActivityItem != null) {
            String str = (String) ((PoolDetailsPresenter$$ExternalSyntheticLambda0) this.mRatios).invoke();
            if (Intrinsics.areEqual(paymentHistoryActivityItem.getUiSender().id, str) || Intrinsics.areEqual(paymentHistoryActivityItem.getUiRecipient().id, str)) {
                return activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem);
            }
        }
        return EmptyFlow.INSTANCE;
    }

    public SecretKeySpec deriveKey(SecretKeySpec secretKeySpec, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] concat = OneOf.concat(bArr, bArr2, bArr3, bArr4, bArr5);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Provider provider = (Provider) ((JCAContext) this.mRatios).provider;
        try {
            MessageDigest messageDigest = provider == null ? MessageDigest.getInstance("SHA-256") : MessageDigest.getInstance("SHA-256", provider);
            int i = 1;
            while (true) {
                long digestLength = messageDigest.getDigestLength() * 8;
                int i2 = (int) digestLength;
                if (i2 != digestLength) {
                    throw new IntegerOverflowException("Integer overflow");
                }
                if (i > (i2 + 255) / i2) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return byteArray.length == 32 ? new SecretKeySpec(byteArray, "AES") : new SecretKeySpec(OneOf.subArray(byteArray, 0, 32), "AES");
                }
                messageDigest.update(TypesJVMKt.toBytes(i));
                messageDigest.update(secretKeySpec.getEncoded());
                if (concat != null) {
                    messageDigest.update(concat);
                }
                try {
                    byteArrayOutputStream.write(messageDigest.digest());
                    i++;
                } catch (IOException e) {
                    throw new JOSEException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("Couldn't write derived key: ")), e);
                }
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new JOSEException("Couldn't get message digest for KDF: " + e2.getMessage(), e2);
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void dispose() {
    }

    public Object execute(String str, byte[] bArr, String str2, String str3, String str4, Function2 function2, SuspendLambda suspendLambda) {
        int i = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt__IntrinsicsJvmKt.intercepted(suspendLambda));
        cancellableContinuationImpl.initCancellability();
        Request.Builder builder = new Request.Builder();
        builder.url(str);
        RequestBody.Companion companion = RequestBody.Companion;
        Regex regex = MediaType.TYPE_SUBTYPE;
        builder.method("POST", RequestBody.Companion.create$default(companion, bArr, UnsignedKt.get(str2), 0, 6));
        builder.header("Content-Type", str2);
        builder.header("Accept", str3);
        if (str4 != null) {
            builder.header("Block-Genie-Session-ID", str4);
        }
        RealCall realCall = new RealCall((OkHttpClient) this.mRatios, new Request(builder), false);
        cancellableContinuationImpl.invokeOnCancellation(new OkHttpZiplineHttpClient$download$2$1(realCall, i));
        realCall.enqueue(new Lazy(2, cancellableContinuationImpl, function2));
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return result;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Rect getBoundingBox() {
        zzu zzuVar = (zzu) this.mRatios;
        if (zzuVar.zze == null) {
            return null;
        }
        int i = 0;
        int i2 = PKIFailureInfo.systemUnavail;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzuVar.zze;
            if (i >= pointArr.length) {
                return new Rect(i3, i4, i2, i5);
            }
            Point point = pointArr[i];
            i3 = Math.min(i3, point.x);
            i2 = Math.max(i2, point.x);
            i4 = Math.min(i4, point.y);
            i5 = Math.max(i5, point.y);
            i++;
        }
    }

    public AnimatorSet getButtonsTranslationAnimator(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        MaterialToolbar materialToolbar = ((SearchViewAnimationHelper) this.mRatios).toolbar;
        ImageButton navigationIconButton = ViewUtils.getNavigationIconButton(materialToolbar);
        if (navigationIconButton != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(SearchViewAnimationHelper.access$2100(r1, ViewUtils.getNavigationIconButton(r1.searchBar), navigationIconButton), RecyclerView.DECELERATION_RATE);
            ofFloat.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(2), new View[]{navigationIconButton}));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(getFromTranslationY(), RecyclerView.DECELERATION_RATE);
            ofFloat2.addUpdateListener(MultiViewUpdateListener.translationYListener(navigationIconButton));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView actionMenuView = ViewUtils.getActionMenuView(materialToolbar);
        if (actionMenuView != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(SearchViewAnimationHelper.access$2100(r1, ViewUtils.getActionMenuView(r1.searchBar), actionMenuView), RecyclerView.DECELERATION_RATE);
            ofFloat3.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(2), new View[]{actionMenuView}));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(getFromTranslationY(), RecyclerView.DECELERATION_RATE);
            ofFloat4.addUpdateListener(MultiViewUpdateListener.translationYListener(actionMenuView));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(z ? 300L : 250L);
        animatorSet.setInterpolator(ReversableAnimatedValueInterpolator.of(z, AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR));
        return animatorSet;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Point[] getCornerPoints() {
        return ((zzu) this.mRatios).zze;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getDetailsPage(String str, ContinuationImpl continuationImpl) {
        RealTreehouseDetailsPageProvider$getDetailsPage$1 realTreehouseDetailsPageProvider$getDetailsPage$1;
        int i;
        ProtoAdapter protoAdapter;
        if (continuationImpl instanceof RealTreehouseDetailsPageProvider$getDetailsPage$1) {
            realTreehouseDetailsPageProvider$getDetailsPage$1 = (RealTreehouseDetailsPageProvider$getDetailsPage$1) continuationImpl;
            int i2 = realTreehouseDetailsPageProvider$getDetailsPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTreehouseDetailsPageProvider$getDetailsPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTreehouseDetailsPageProvider$getDetailsPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTreehouseDetailsPageProvider$getDetailsPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProtoAdapter protoAdapter2 = DetailsPage.ADAPTER;
                    HostDiscoverDataBridge hostDiscoverDataBridge = (HostDiscoverDataBridge) ((kotlin.Lazy) this.mRatios).getValue();
                    realTreehouseDetailsPageProvider$getDetailsPage$1.L$1 = protoAdapter2;
                    realTreehouseDetailsPageProvider$getDetailsPage$1.label = 1;
                    Object detailsPage = hostDiscoverDataBridge.getDetailsPage(str, realTreehouseDetailsPageProvider$getDetailsPage$1);
                    if (detailsPage == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = detailsPage;
                    protoAdapter = protoAdapter2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    protoAdapter = realTreehouseDetailsPageProvider$getDetailsPage$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                return protoAdapter.decode((ByteString) obj);
            }
        }
        realTreehouseDetailsPageProvider$getDetailsPage$1 = new RealTreehouseDetailsPageProvider$getDetailsPage$1(this, continuationImpl);
        Object obj2 = realTreehouseDetailsPageProvider$getDetailsPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTreehouseDetailsPageProvider$getDetailsPage$1.label;
        if (i != 0) {
        }
        return protoAdapter.decode((ByteString) obj2);
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public AnimatorSet getExpandCollapseAnimatorSet(boolean z) {
        int i;
        int i2;
        int i3;
        View view;
        EditText editText;
        Animator animator;
        AnimatorSet animatorSet = new AnimatorSet();
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        EditText editText2 = searchViewAnimationHelper.editText;
        View view2 = searchViewAnimationHelper.divider;
        SearchView searchView = searchViewAnimationHelper.searchView;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.backHelper;
        Toolbar toolbar = searchViewAnimationHelper.dummyToolbar;
        if (searchViewAnimationHelper.backProgressAnimatorSet == null) {
            animatorSet.playTogether(getButtonsTranslationAnimator(z));
        }
        TimeInterpolator timeInterpolator = z ? AnimationUtils.LINEAR_INTERPOLATOR : AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat.setDuration(z ? 300L : 250L);
        ofFloat.setStartDelay(z ? 100L : 0L);
        ofFloat.setInterpolator(ReversableAnimatedValueInterpolator.of(z, timeInterpolator));
        ofFloat.addUpdateListener(MultiViewUpdateListener.alphaListener(searchViewAnimationHelper.scrim));
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper.rootView;
        Rect rect = materialMainContainerBackHelper.initialHideToClipBounds;
        Rect rect2 = materialMainContainerBackHelper.initialHideFromClipBounds;
        if (rect != null) {
            view = view2;
            i2 = 1;
            i = 0;
            i3 = 2;
        } else {
            i = 0;
            i2 = 1;
            i3 = 2;
            view = view2;
            rect = new Rect(searchView.getLeft(), searchView.getTop(), searchView.getRight(), searchView.getBottom());
        }
        if (rect2 == null) {
            rect2 = ViewUtils.calculateOffsetRectFromBounds(clippableRoundedCornerLayout, searchViewAnimationHelper.searchBar);
        }
        final Rect rect3 = new Rect(rect2);
        final float topLeftCornerResolvedSize = searchViewAnimationHelper.searchBar.backgroundShape.getTopLeftCornerResolvedSize();
        float[] fArr = clippableRoundedCornerLayout.cornerRadii;
        float[] expandedCornerRadii = materialMainContainerBackHelper.getExpandedCornerRadii();
        float max = Math.max(fArr[i], expandedCornerRadii[i]);
        float max2 = Math.max(fArr[i2], expandedCornerRadii[i2]);
        float max3 = Math.max(fArr[i3], expandedCornerRadii[i3]);
        float max4 = Math.max(fArr[3], expandedCornerRadii[3]);
        float max5 = Math.max(fArr[4], expandedCornerRadii[4]);
        int i4 = 5;
        float max6 = Math.max(fArr[5], expandedCornerRadii[5]);
        float max7 = Math.max(fArr[6], expandedCornerRadii[6]);
        float max8 = Math.max(fArr[7], expandedCornerRadii[7]);
        final float[] fArr2 = new float[8];
        fArr2[i] = max;
        fArr2[i2] = max2;
        fArr2[i3] = max3;
        fArr2[3] = max4;
        fArr2[4] = max5;
        fArr2[5] = max6;
        fArr2[6] = max7;
        fArr2[7] = max8;
        ValueAnimator ofObject = ValueAnimator.ofObject(new RectEvaluator(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.SearchViewAnimationHelper$DefaultAnimationDelegate$$ExternalSyntheticLambda1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float[] fArr3 = fArr2;
                float f = fArr3[0];
                float f2 = topLeftCornerResolvedSize;
                float[] fArr4 = {AnimationUtils.lerp(f2, f, animatedFraction), AnimationUtils.lerp(f2, fArr3[1], animatedFraction), AnimationUtils.lerp(f2, fArr3[2], animatedFraction), AnimationUtils.lerp(f2, fArr3[3], animatedFraction), AnimationUtils.lerp(f2, fArr3[4], animatedFraction), AnimationUtils.lerp(f2, fArr3[5], animatedFraction), AnimationUtils.lerp(f2, fArr3[6], animatedFraction), AnimationUtils.lerp(f2, fArr3[7], animatedFraction)};
                ClippableRoundedCornerLayout clippableRoundedCornerLayout2 = ((SearchViewAnimationHelper) SizeMap.this.mRatios).rootView;
                clippableRoundedCornerLayout2.getClass();
                Rect rect4 = rect3;
                clippableRoundedCornerLayout2.updateClipBoundsAndCornerRadii(rect4.left, rect4.top, rect4.right, rect4.bottom, fArr4);
            }
        });
        ofObject.setDuration(z ? 300L : 250L);
        FastOutSlowInInterpolator fastOutSlowInInterpolator = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
        ofObject.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        Animator access$900 = SearchViewAnimationHelper.access$900(searchViewAnimationHelper, z);
        AnimatorSet animatorSet2 = new AnimatorSet();
        float[] fArr3 = new float[i3];
        // fill-array-data instruction
        fArr3[0] = 0.0f;
        fArr3[1] = 1.0f;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr3);
        ofFloat2.setDuration(z ? 150L : 83L);
        ofFloat2.setStartDelay(z ? 75L : 0L);
        LinearInterpolator linearInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        ofFloat2.setInterpolator(ReversableAnimatedValueInterpolator.of(z, linearInterpolator));
        TouchObserverFrameLayout touchObserverFrameLayout = searchViewAnimationHelper.contentContainer;
        View[] viewArr = new View[2];
        viewArr[i] = view;
        viewArr[i2] = touchObserverFrameLayout;
        ofFloat2.addUpdateListener(MultiViewUpdateListener.alphaListener(viewArr));
        float[] fArr4 = new float[2];
        fArr4[i] = (touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f;
        fArr4[i2] = 0.0f;
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(fArr4);
        ofFloat3.setDuration(z ? 300L : 250L);
        ofFloat3.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        ofFloat3.addUpdateListener(MultiViewUpdateListener.translationYListener(view));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat4.setDuration(z ? 300L : 250L);
        ofFloat4.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        View[] viewArr2 = new View[i2];
        viewArr2[i] = touchObserverFrameLayout;
        ofFloat4.addUpdateListener(new MultiViewUpdateListener(new AesGcmSiv$$ExternalSyntheticLambda0(4), viewArr2));
        Animator[] animatorArr = new Animator[3];
        animatorArr[i] = ofFloat2;
        animatorArr[i2] = ofFloat3;
        animatorArr[2] = ofFloat4;
        animatorSet2.playTogether(animatorArr);
        View view3 = searchViewAnimationHelper.headerContainer;
        Animator translationAnimator = getTranslationAnimator(z, view3, getFromTranslationXEnd(view3), getFromTranslationY());
        Animator translationAnimator2 = getTranslationAnimator(z, toolbar, getFromTranslationXEnd(toolbar) - (searchViewAnimationHelper.searchBar.getPaddingEnd() - toolbar.getPaddingEnd()), getFromTranslationY());
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
        ofFloat5.setDuration(z ? 300L : 250L);
        ofFloat5.setInterpolator(ReversableAnimatedValueInterpolator.of(z, fastOutSlowInInterpolator));
        if (searchView.animatedMenuItems) {
            ofFloat5.addUpdateListener(new FadeThroughUpdateListener(ViewUtils.getActionMenuView(toolbar), ViewUtils.getActionMenuView(searchViewAnimationHelper.toolbar)));
        }
        Animator translationAnimatorForText = getTranslationAnimatorForText(editText2, z);
        Animator translationAnimatorForText2 = getTranslationAnimatorForText(searchViewAnimationHelper.searchPrefix, z);
        AnimatorSet animatorSet3 = new AnimatorSet();
        if (searchViewAnimationHelper.searchBar == null || TextUtils.equals(editText2.getText(), searchViewAnimationHelper.searchBar.textView.getText())) {
            editText = editText2;
        } else {
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
            editText = editText2;
            ofFloat6.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(this, 8));
            Animator[] animatorArr2 = new Animator[1];
            animatorArr2[i] = ofFloat6;
            animatorSet3.playTogether(animatorArr2);
        }
        if (searchViewAnimationHelper.searchBar == null || !TextUtils.equals(editText.getText(), searchViewAnimationHelper.searchBar.textView.getText())) {
            animator = translationAnimatorForText;
        } else {
            animator = translationAnimatorForText;
            int i5 = i;
            Rect rect4 = new Rect(i5, i5, editText.getWidth(), editText.getHeight());
            ValueAnimator ofInt = ValueAnimator.ofInt(searchViewAnimationHelper.searchBar.textView.getWidth(), editText.getWidth());
            ofInt.addUpdateListener(new KnotSpinnerView$$ExternalSyntheticLambda3(i4, this, rect4));
            Animator[] animatorArr3 = new Animator[1];
            animatorArr3[i5] = ofInt;
            animatorSet3.playTogether(animatorArr3);
        }
        animatorSet3.setDuration(z ? 300L : 250L);
        animatorSet3.setInterpolator(ReversableAnimatedValueInterpolator.of(z, linearInterpolator));
        animatorSet.playTogether(ofFloat, ofObject, access$900, animatorSet2, translationAnimator, translationAnimator2, ofFloat5, animator, translationAnimatorForText2, animatorSet3);
        return animatorSet;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public List getExpandCollapseSpringAnimations(boolean z) {
        return new ArrayList();
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public int getFormat() {
        return ((zzu) this.mRatios).zza;
    }

    public int getFromTranslationXEnd(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        int viewLeftFromSearchViewParent = searchViewAnimationHelper.getViewLeftFromSearchViewParent(searchViewAnimationHelper.searchBar);
        return ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar) ? viewLeftFromSearchViewParent - marginEnd : ((searchViewAnimationHelper.searchBar.getWidth() + viewLeftFromSearchViewParent) + marginEnd) - searchViewAnimationHelper.searchView.getWidth();
    }

    public int getFromTranslationY() {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        FrameLayout frameLayout = searchViewAnimationHelper.toolbarContainer;
        return ((searchViewAnimationHelper.searchBar.getHeight() / 2) + SearchViewAnimationHelper.access$2000(searchViewAnimationHelper, searchViewAnimationHelper.searchBar)) - ((frameLayout.getHeight() / 2) + frameLayout.getTop());
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public Material.ProgramSource getProgramSource() {
        return ((BumpNoisePBRMaterial) this.mRatios).instanced ? new Material.ProgramSource("\n    precision highp float;\n\n    // Per-vertex attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Per-instance attributes — set up with glVertexAttribDivisor(loc, 1).\n    attribute vec4 aInstanceModel0;\n    attribute vec4 aInstanceModel1;\n    attribute vec4 aInstanceModel2;\n    attribute vec4 aInstanceModel3;\n    attribute float aInstanceOpacity;\n\n    // Scene uniforms (uModelMatrix from per-instance attrs above; not used).\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n    varying float vInstanceOpacity;\n\n    void main() {\n      mat4 modelMatrix = mat4(aInstanceModel0, aInstanceModel1, aInstanceModel2, aInstanceModel3);\n\n      vec4 worldPos = modelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      mat3 normalMatrix = mat3(modelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      vUV = aUV;\n      vInstanceOpacity = aInstanceOpacity;\n\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader("#ifdef GL_FRAGMENT_PRECISION_HIGH\n#define BUMP_HP highp\n#else\n#define BUMP_HP mediump\n#endif\n\nuniform BUMP_HP float uBumpScale;\nuniform float uBumpStrength;\nuniform int uBumpOctaves;\n\nBUMP_HP vec3 _bumpHashV(BUMP_HP vec3 p) {\n  p = fract(p * 0.1031);\n  p += dot(p, p.yzx + 33.33);\n  return fract((p.xxy + p.yzz) * p.zyx);\n}\n\nfloat _bumpVnoise(BUMP_HP vec3 p) {\n  BUMP_HP vec3 i = floor(p);\n  BUMP_HP vec3 f = fract(p);\n  f = f * f * (3.0 - 2.0 * f);\n  float n000 = _bumpHashV(i + vec3(0.0, 0.0, 0.0)).x;\n  float n100 = _bumpHashV(i + vec3(1.0, 0.0, 0.0)).x;\n  float n010 = _bumpHashV(i + vec3(0.0, 1.0, 0.0)).x;\n  float n110 = _bumpHashV(i + vec3(1.0, 1.0, 0.0)).x;\n  float n001 = _bumpHashV(i + vec3(0.0, 0.0, 1.0)).x;\n  float n101 = _bumpHashV(i + vec3(1.0, 0.0, 1.0)).x;\n  float n011 = _bumpHashV(i + vec3(0.0, 1.0, 1.0)).x;\n  float n111 = _bumpHashV(i + vec3(1.0, 1.0, 1.0)).x;\n  float n00 = mix(n000, n100, f.x);\n  float n10 = mix(n010, n110, f.x);\n  float n01 = mix(n001, n101, f.x);\n  float n11 = mix(n011, n111, f.x);\n  float n0 = mix(n00, n10, f.y);\n  float n1 = mix(n01, n11, f.y);\n  return mix(n0, n1, f.z);\n}\n\n// GLSL ES 2.0 disallows non-constant loop counts; use a fixed cap and break early.\nfloat _bumpFnoise(BUMP_HP vec3 p, int octaves) {\n  float v = 0.0;\n  float a = 1.0;\n  float total = 0.0;\n  BUMP_HP vec3 q = p;\n  for (int i = 0; i < 4; ++i) {\n    if (i >= octaves) break;\n    v += a * _bumpVnoise(q);\n    total += a;\n    a *= 0.5;\n    q *= 2.0;\n  }\n  return v / total;\n}", "void material(inout MaterialInputs inputs) {\n  prepareMaterial(inputs);\n\n  // BUMP_HP sample point so the fBm loop's q *= 2.0 can reach ~32k at slider extremes\n  // without floor() losing integer-grid precision (see MATERIAL_UNIFORMS comment).\n  BUMP_HP vec3 sp = vObjectPosition * uBumpScale;\n  // GLSL ES 2.0 has no max(int, int); ternary keeps octaves >= 1 to avoid 0-div in fnoise.\n  int oct = uBumpOctaves > 0 ? uBumpOctaves : 1;\n  float h0 = _bumpFnoise(sp, oct);\n  float hX = _bumpFnoise(sp + vec3(0.5, 0.0, 0.0), oct);\n  float hY = _bumpFnoise(sp + vec3(0.0, 0.5, 0.0), oct);\n  float hZ = _bumpFnoise(sp + vec3(0.0, 0.0, 0.5), oct);\n  vec3 grad = vec3(hX - h0, hY - h0, hZ - h0);\n  vec3 N = shading_normal;\n  vec3 gT = grad - dot(grad, N) * N;\n  shading_normal = normalize(N - gT * uBumpStrength);\n}", true)) : new Material.ProgramSource("\n    precision highp float;\n    \n    // Attributes\n    attribute vec3 aPosition;\n    attribute vec3 aNormal;\n    attribute vec3 aTangent;\n    attribute vec3 aBitangent;\n    attribute vec2 aUV;\n\n    // Uniforms\n    uniform mat4 uProjectionMatrix;\n    uniform mat4 uViewMatrix;\n    uniform mat4 uModelMatrix;\n\n    // Varyings (to fragment shader)\n    varying vec3 vPosition;\n    varying vec3 vObjectPosition;  // pre-transform aPosition; used by procedural noise materials\n                                   // that need a stable, model-space sample point\n    varying vec3 vNormal;\n    varying vec3 vTangent;\n    varying vec3 vBitangent;\n    varying vec2 vUV;\n\n    void main() {\n      // Transform position to world space\n      vec4 worldPos = uModelMatrix * vec4(aPosition, 1.0);\n      vPosition = worldPos.xyz;\n      vObjectPosition = aPosition;\n\n      // Transform normal, tangent, bitangent to world space\n      mat3 normalMatrix = mat3(uModelMatrix);\n      vNormal = normalize(normalMatrix * aNormal);\n      vTangent = normalize(normalMatrix * aTangent);\n      vBitangent = normalize(normalMatrix * aBitangent);\n\n      // Pass through UV\n      vUV = aUV;\n\n      // Calculate final position\n      gl_Position = uProjectionMatrix * uViewMatrix * worldPos;\n    }\n  ", FlowsKt.buildFragmentShader("#ifdef GL_FRAGMENT_PRECISION_HIGH\n#define BUMP_HP highp\n#else\n#define BUMP_HP mediump\n#endif\n\nuniform BUMP_HP float uBumpScale;\nuniform float uBumpStrength;\nuniform int uBumpOctaves;\n\nBUMP_HP vec3 _bumpHashV(BUMP_HP vec3 p) {\n  p = fract(p * 0.1031);\n  p += dot(p, p.yzx + 33.33);\n  return fract((p.xxy + p.yzz) * p.zyx);\n}\n\nfloat _bumpVnoise(BUMP_HP vec3 p) {\n  BUMP_HP vec3 i = floor(p);\n  BUMP_HP vec3 f = fract(p);\n  f = f * f * (3.0 - 2.0 * f);\n  float n000 = _bumpHashV(i + vec3(0.0, 0.0, 0.0)).x;\n  float n100 = _bumpHashV(i + vec3(1.0, 0.0, 0.0)).x;\n  float n010 = _bumpHashV(i + vec3(0.0, 1.0, 0.0)).x;\n  float n110 = _bumpHashV(i + vec3(1.0, 1.0, 0.0)).x;\n  float n001 = _bumpHashV(i + vec3(0.0, 0.0, 1.0)).x;\n  float n101 = _bumpHashV(i + vec3(1.0, 0.0, 1.0)).x;\n  float n011 = _bumpHashV(i + vec3(0.0, 1.0, 1.0)).x;\n  float n111 = _bumpHashV(i + vec3(1.0, 1.0, 1.0)).x;\n  float n00 = mix(n000, n100, f.x);\n  float n10 = mix(n010, n110, f.x);\n  float n01 = mix(n001, n101, f.x);\n  float n11 = mix(n011, n111, f.x);\n  float n0 = mix(n00, n10, f.y);\n  float n1 = mix(n01, n11, f.y);\n  return mix(n0, n1, f.z);\n}\n\n// GLSL ES 2.0 disallows non-constant loop counts; use a fixed cap and break early.\nfloat _bumpFnoise(BUMP_HP vec3 p, int octaves) {\n  float v = 0.0;\n  float a = 1.0;\n  float total = 0.0;\n  BUMP_HP vec3 q = p;\n  for (int i = 0; i < 4; ++i) {\n    if (i >= octaves) break;\n    v += a * _bumpVnoise(q);\n    total += a;\n    a *= 0.5;\n    q *= 2.0;\n  }\n  return v / total;\n}", "void material(inout MaterialInputs inputs) {\n  prepareMaterial(inputs);\n\n  // BUMP_HP sample point so the fBm loop's q *= 2.0 can reach ~32k at slider extremes\n  // without floor() losing integer-grid precision (see MATERIAL_UNIFORMS comment).\n  BUMP_HP vec3 sp = vObjectPosition * uBumpScale;\n  // GLSL ES 2.0 has no max(int, int); ternary keeps octaves >= 1 to avoid 0-div in fnoise.\n  int oct = uBumpOctaves > 0 ? uBumpOctaves : 1;\n  float h0 = _bumpFnoise(sp, oct);\n  float hX = _bumpFnoise(sp + vec3(0.5, 0.0, 0.0), oct);\n  float hY = _bumpFnoise(sp + vec3(0.0, 0.5, 0.0), oct);\n  float hZ = _bumpFnoise(sp + vec3(0.0, 0.0, 0.5), oct);\n  vec3 grad = vec3(hX - h0, hY - h0, hZ - h0);\n  vec3 N = shading_normal;\n  vec3 gT = grad - dot(grad, N) * N;\n  shading_normal = normalize(N - gT * uBumpStrength);\n}", false));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public String getRawValue() {
        return ((zzu) this.mRatios).zzb;
    }

    public AnimatorSet getTranslationAnimatorForText(View view, boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        TextView textView = searchViewAnimationHelper.searchBar.placeholderTextView;
        if (TextUtils.isEmpty(textView.getText()) || z) {
            textView = searchViewAnimationHelper.searchBar.textView;
        }
        int viewLeftFromSearchViewParent = searchViewAnimationHelper.getViewLeftFromSearchViewParent(textView) - searchViewAnimationHelper.getViewLeftFromSearchViewParent(view);
        if (ViewUtils.isLayoutRtl(searchViewAnimationHelper.searchBar)) {
            viewLeftFromSearchViewParent += textView.getWidth() - view.getWidth();
        }
        return getTranslationAnimator(z, view, viewLeftFromSearchViewParent, getFromTranslationY());
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public Obfuscator getUrl() {
        zzs zzsVar = ((zzu) this.mRatios).zzj;
        if (zzsVar != null) {
            return new Obfuscator(zzsVar.zzb, 3);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public int getValueType() {
        return ((zzu) this.mRatios).zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object link(BankAccountLinker$Args bankAccountLinker$Args, ContinuationImpl continuationImpl) {
        RealBankAccountLinker$link$1 realBankAccountLinker$link$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealBankAccountLinker$link$1) {
            realBankAccountLinker$link$1 = (RealBankAccountLinker$link$1) continuationImpl;
            int i2 = realBankAccountLinker$link$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBankAccountLinker$link$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBankAccountLinker$link$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBankAccountLinker$link$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = bankAccountLinker$Args.routingNumber;
                    String str2 = bankAccountLinker$Args.accountNumber;
                    RequestContext requestContext = bankAccountLinker$Args.requestContext;
                    LinkBankAccountRequest linkBankAccountRequest = new LinkBankAccountRequest(requestContext, str, str2, requestContext.payment_tokens, requestContext.transfer_token, ByteString.EMPTY);
                    AppService appService = (AppService) this.mRatios;
                    ClientScenario clientScenario = bankAccountLinker$Args.clientScenario;
                    String str3 = bankAccountLinker$Args.flowToken;
                    realBankAccountLinker$link$1.label = 1;
                    obj = appService.linkBankAccount(clientScenario, str3, linkBankAccountRequest, realBankAccountLinker$link$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    if (apiResult instanceof ApiResult.Failure) {
                        return new BankAccountLinker$Result.NetworkFailure((ApiResult.Failure) apiResult);
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                LinkBankAccountResponse linkBankAccountResponse = (LinkBankAccountResponse) ((ApiResult.Success) apiResult).response;
                ResponseContext responseContext = linkBankAccountResponse.response_context;
                String str4 = responseContext != null ? responseContext.failure_message : null;
                return str4 != null ? new BankAccountLinker$Result.NotSuccessful(str4) : new BankAccountLinker$Result.Successful(linkBankAccountResponse.instrument, responseContext);
            }
        }
        realBankAccountLinker$link$1 = new RealBankAccountLinker$link$1(this, continuationImpl);
        Object obj2 = realBankAccountLinker$link$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBankAccountLinker$link$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void onAnimationEnd(boolean z) {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        EditText editText = searchViewAnimationHelper.editText;
        SearchViewAnimationHelper.access$1000(searchViewAnimationHelper, z ? 1.0f : RecyclerView.DECELERATION_RATE);
        editText.setAlpha(1.0f);
        SearchBar searchBar = searchViewAnimationHelper.searchBar;
        if (searchBar != null) {
            searchBar.textView.setAlpha(1.0f);
        }
        editText.setClipBounds(null);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper.rootView;
        clippableRoundedCornerLayout.path = null;
        clippableRoundedCornerLayout.cornerRadii = new float[]{RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE};
        clippableRoundedCornerLayout.invalidate();
        if (z) {
            return;
        }
        searchViewAnimationHelper.backHelper.expandedCornerRadii = null;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void onAnimationStart(boolean z) {
        SearchViewAnimationHelper.access$1000((SearchViewAnimationHelper) this.mRatios, z ? RecyclerView.DECELERATION_RATE : 1.0f);
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.mRatios;
        baseTransientBottomBar.extraBottomMarginWindowInset = windowInsetsCompat.getSystemWindowInsetBottom();
        baseTransientBottomBar.extraLeftMarginWindowInset = windowInsetsCompat.getSystemWindowInsetLeft();
        baseTransientBottomBar.extraRightMarginWindowInset = windowInsetsCompat.getSystemWindowInsetRight();
        baseTransientBottomBar.updateMargins();
        return windowInsetsCompat;
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onError(ImageRequest imageRequest, ErrorResult errorResult) {
        switch (this.$r8$classId) {
            case 13:
                ((FullscreenAdView) this.mRatios).updateWindowFlags(true);
                break;
            default:
                Context context = ((ProfileCropView) this.mRatios).getContext();
                context.getClass();
                ToastKt.toast(context, R.string.profile_crop_failed, 0);
                break;
        }
    }

    @Override // coil3.request.ImageRequest.Listener
    public void onSuccess(SuccessResult successResult) {
        switch (this.$r8$classId) {
            case 13:
                ((FullscreenAdView) this.mRatios).updateWindowFlags(false);
                break;
            default:
                ((ProfileCropView) this.mRatios).getOkView().setEnabled(true);
                break;
        }
    }

    @Override // com.squareup.cash.graphics.swampgl.components.MaterialPlugin
    public void prepareMaterialInput(MaterialInput materialInput) {
        materialInput.getClass();
        materialInput.baseColor = ((BumpNoisePBRMaterial) this.mRatios).baseColor;
        materialInput.roughness = ((BumpNoisePBRMaterial) this.mRatios).roughness;
        materialInput.metallic = ((BumpNoisePBRMaterial) this.mRatios).metallic;
        materialInput.opacity = ((BumpNoisePBRMaterial) this.mRatios).opacity;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object retailersNearLocation(double d, double d2, double d3, ContinuationImpl continuationImpl) {
        RealAtmRetailerLocationManager$retailersNearLocation$1 realAtmRetailerLocationManager$retailersNearLocation$1;
        int i;
        if (continuationImpl instanceof RealAtmRetailerLocationManager$retailersNearLocation$1) {
            realAtmRetailerLocationManager$retailersNearLocation$1 = (RealAtmRetailerLocationManager$retailersNearLocation$1) continuationImpl;
            int i2 = realAtmRetailerLocationManager$retailersNearLocation$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realAtmRetailerLocationManager$retailersNearLocation$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realAtmRetailerLocationManager$retailersNearLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realAtmRetailerLocationManager$retailersNearLocation$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    double min = Math.min(Math.max(d3 * 6.21371E-4d, 0.1d), 25.0d);
                    MoneymapAppService moneymapAppService = (MoneymapAppService) this.mRatios;
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(RetailerType.IN_NETWORK_WITHDRAWAL);
                    Double d4 = new Double(min);
                    Double d5 = new Double(d);
                    Double d6 = new Double(d2);
                    ByteString byteString = ByteString.EMPTY;
                    GetRetailerLocationsRequest getRetailerLocationsRequest = new GetRetailerLocationsRequest(listOf, d4, new GetRetailerLocationsRequest$Query$LatLongQuery(new GetRetailerLocationsRequest.LatLongQuery(d5, d6, byteString)), byteString);
                    realAtmRetailerLocationManager$retailersNearLocation$1.label = 1;
                    obj = moneymapAppService.getRetailerLocations(getRetailerLocationsRequest, realAtmRetailerLocationManager$retailersNearLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                GetRetailerLocationsResponse getRetailerLocationsResponse = (GetRetailerLocationsResponse) (apiResult instanceof ApiResult.Success ? ((ApiResult.Success) apiResult).response : null);
                return getRetailerLocationsResponse == null ? new AtmRetailerLocationManager$Result.Success(getRetailerLocationsResponse.retailer_locations) : AtmRetailerLocationManager$Result.Failure.INSTANCE;
            }
        }
        realAtmRetailerLocationManager$retailersNearLocation$1 = new RealAtmRetailerLocationManager$retailersNearLocation$1(this, continuationImpl);
        Object obj2 = realAtmRetailerLocationManager$retailersNearLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realAtmRetailerLocationManager$retailersNearLocation$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        GetRetailerLocationsResponse getRetailerLocationsResponse2 = (GetRetailerLocationsResponse) (apiResult2 instanceof ApiResult.Success ? ((ApiResult.Success) apiResult2).response : null);
        if (getRetailerLocationsResponse2 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object search(SearchQuery searchQuery, ContinuationImpl continuationImpl) {
        RealBrandsSearchRepository$search$1 realBrandsSearchRepository$search$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof RealBrandsSearchRepository$search$1) {
            realBrandsSearchRepository$search$1 = (RealBrandsSearchRepository$search$1) continuationImpl;
            int i2 = realBrandsSearchRepository$search$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realBrandsSearchRepository$search$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realBrandsSearchRepository$search$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realBrandsSearchRepository$search$1.label;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CustomerSearchClientService customerSearchClientService = (CustomerSearchClientService) this.mRatios;
                    ShopSearchBrandsRequest shopSearchBrandsRequest = new ShopSearchBrandsRequest(searchQuery.searchText, searchQuery.shopFlowToken, searchQuery.searchFlowToken, ByteString.EMPTY);
                    realBrandsSearchRepository$search$1.label = 1;
                    obj = customerSearchClientService.shopSearchBrands(shopSearchBrandsRequest, realBrandsSearchRepository$search$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                int i3 = 4;
                if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
                    List list = Collections.EMPTY_LIST;
                    list.getClass();
                    return new SearchResults(i3, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) apiResult).code, "Error: "), str, list);
                }
                if (apiResult instanceof ApiResult.Failure.NetworkFailure) {
                    List list2 = Collections.EMPTY_LIST;
                    list2.getClass();
                    return new SearchResults(i3, Recorder$$ExternalSyntheticOutline2.m("Error: ", ((ApiResult.Failure.NetworkFailure) apiResult).error.getLocalizedMessage()), str, list2);
                }
                if (!(apiResult instanceof ApiResult.Success)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ShopSearchBrandsResponse shopSearchBrandsResponse = (ShopSearchBrandsResponse) ((ApiResult.Success) apiResult).response;
                shopSearchBrandsResponse.getClass();
                List list3 = shopSearchBrandsResponse.sections;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(FocusStrategy.transform((SearchCommonSection) it.next()));
                }
                return new SearchResults(6, str, str, arrayList);
            }
        }
        realBrandsSearchRepository$search$1 = new RealBrandsSearchRepository$search$1(this, continuationImpl);
        Object obj2 = realBrandsSearchRepository$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realBrandsSearchRepository$search$1.label;
        String str2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        int i32 = 4;
        if (!(apiResult instanceof ApiResult.Failure.HttpFailure)) {
        }
    }

    public void set(Object obj) {
        ((DelegatingScheduledFuture) this.mRatios).set(obj);
    }

    public void setException(Exception exc) {
        ((DelegatingScheduledFuture) this.mRatios).setException(exc);
    }

    public void setMessagingClientEvent(MessagingClientEvent messagingClientEvent) {
        this.mRatios = messagingClientEvent;
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void setUpDummyToolbarIfNeeded() {
        SearchViewAnimationHelper searchViewAnimationHelper = (SearchViewAnimationHelper) this.mRatios;
        Toolbar toolbar = searchViewAnimationHelper.dummyToolbar;
        MenuBuilder menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (!SearchViewAnimationHelper.access$500(searchViewAnimationHelper)) {
            toolbar.setVisibility(8);
            return;
        }
        toolbar.inflateMenu(searchViewAnimationHelper.searchBar.menuResId);
        SearchViewAnimationHelper.access$700(searchViewAnimationHelper, toolbar);
        toolbar.setVisibility(0);
    }

    @Override // com.google.android.material.search.SearchViewAnimationHelper.AnimationDelegate
    public void startButtonsTranslationAnimation() {
        getButtonsTranslationAnimator(false).start();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
    public HuffmanTreeGroup zza() {
        SubtreeManager subtreeManager = new SubtreeManager();
        zzra zzraVar = zzb.zzf() ? zzra.TYPE_THICK : zzra.TYPE_THIN;
        zzrb zzrbVar = (zzrb) this.mRatios;
        subtreeManager.emitActionToParent = zzraVar;
        n.b bVar = new n.b(23);
        bVar.b = zzrbVar;
        subtreeManager.interceptor = new zzru(bVar);
        return new HuffmanTreeGroup(subtreeManager, 0);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public /* synthetic */ void onSuccess(Object obj) {
        ((Function1) this.mRatios).invoke(obj);
    }

    @Override // com.google.android.play.core.splitcompat.zzl
    public void zza(zzm zzmVar, File file, boolean z) {
        MetadataRepo metadataRepo = (MetadataRepo) this.mRatios;
        ((HashSet) metadataRepo.mEmojiCharArray).add(file);
        if (z) {
            return;
        }
        ((AtomicBoolean) metadataRepo.mRootNode).set(false);
    }

    @Override // com.squareup.cash.moneybot.components.api.ClientRenderableUi
    public /* bridge */ /* synthetic */ void Content(Object obj, Function1 function1, Composer composer) {
        Content((GenieCardViewModel) obj, function1, composer, 0);
    }

    public /* synthetic */ SizeMap(Object obj, int i) {
        this.$r8$classId = i;
        this.mRatios = obj;
    }

    public SizeMap(String str) {
        Uri uri;
        this.$r8$classId = 24;
        try {
            uri = Uri.parse(str);
        } catch (Throwable unused) {
            uri = null;
        }
        this.mRatios = uri;
    }

    public SizeMap(int i) {
        this.$r8$classId = i;
        switch (i) {
            case 11:
                this.mRatios = new JCAContext(0);
                break;
            case 19:
                this.mRatios = new Regex("rgba\\((\\d{1,3}), (\\d{1,3}), (\\d{1,3}), (0|0?\\.\\d+|1)\\)");
                break;
            default:
                this.mRatios = new ArrayMap(0);
                break;
        }
    }

    public SizeMap(Navigator navigator) {
        this.$r8$classId = 22;
        navigator.getClass();
        this.mRatios = navigator;
    }

    public SizeMap(Map map) {
        this.$r8$classId = 18;
        this.mRatios = LazyKt.lazy(new qg$$ExternalSyntheticLambda0(1, map));
    }

    public /* synthetic */ SizeMap(int i, boolean z) {
        this.$r8$classId = i;
    }

    public SizeMap(BumpNoisePBRMaterial bumpNoisePBRMaterial) {
        this.$r8$classId = 15;
        this.mRatios = bumpNoisePBRMaterial;
        bumpNoisePBRMaterial.markReady();
    }
}
