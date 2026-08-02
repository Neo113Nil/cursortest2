package com.squareup.contour;

import app.cash.redwood.treehouse.RealTreehouseApp;
import com.squareup.cash.treehouse.activity.ActivityPaymentManager;
import com.squareup.protos.cash.cashapproxy.api.Text;
import com.squareup.protos.cash.cashbusinessaccounts.api.v1.C4bEligibilityState;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMoney;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.Button;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.CountryCodeMetadata;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Pair;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlinx.coroutines.Empty;
import kotlinx.coroutines.Incomplete;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.ChannelSegment;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class SizeMode$EnumUnboxingLocalUtility {
    public static /* synthetic */ int getMask(int i) {
        if (i == 1) {
            return 1073741824;
        }
        if (i == 2) {
            return PKIFailureInfo.systemUnavail;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(RealTreehouseApp.Factory factory) {
        boolean isTerminated;
        if (factory instanceof AutoCloseable) {
            factory.close();
            return;
        }
        if (!(factory instanceof ExecutorService)) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return;
        }
        ExecutorService executorService = (ExecutorService) factory;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static Object m(ActivityPaymentManager activityPaymentManager, List list, int i) {
        activityPaymentManager.getClass();
        list.getClass();
        Object obj = list.get(i);
        obj.getClass();
        return obj;
    }

    public static String m(String str, LocalErrorResponse localErrorResponse, String str2) {
        return str + localErrorResponse + str2;
    }

    public static String m(ReflectionFactory reflectionFactory, Class cls, StringBuilder sb) {
        sb.append(reflectionFactory.getOrCreateKotlinClass(cls));
        return sb.toString();
    }

    public static StringBuilder m(String str, TypeConstructorMarker typeConstructorMarker, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(typeConstructorMarker);
        sb.append(str2);
        return sb;
    }

    public static LinkedHashMap m(ProtoReader protoReader) {
        protoReader.getClass();
        return new LinkedHashMap();
    }

    public static Pair m(String str, int i, String str2, String str3, String str4) {
        return new Pair(str4, new CountryCodeMetadata(str, str2, str3, i));
    }

    public static Pair m(String str, String str2, String str3, String str4) {
        return new Pair(str4, new PhoneNumberFormatter.Metadata(str, str2, str3));
    }

    public static int m(boolean z, ProtoAdapter protoAdapter, int i, int i2) {
        return protoAdapter.encodedSizeWithTag(i, Boolean.valueOf(z)) + i2;
    }

    public static void m(String str, Text text, ArrayList arrayList) {
        arrayList.add(str + text);
    }

    public static void m(String str, C4bEligibilityState c4bEligibilityState, ArrayList arrayList) {
        arrayList.add(str + c4bEligibilityState);
    }

    public static void m(String str, com.squareup.protos.cash.discover.api.app.v1.model.Text text, ArrayList arrayList) {
        arrayList.add(str + text);
    }

    public static void m(String str, LocalColor localColor, ArrayList arrayList) {
        arrayList.add(str + localColor);
    }

    public static void m(String str, LocalImage localImage, ArrayList arrayList) {
        arrayList.add(str + localImage);
    }

    public static void m(String str, LocalMoney localMoney, ArrayList arrayList) {
        arrayList.add(str + localMoney);
    }

    public static void m(String str, AppMessageAction appMessageAction, ArrayList arrayList) {
        arrayList.add(str + appMessageAction);
    }

    public static void m(String str, com.squareup.protos.cash.p2p.profile_directory.ui.Text text, ArrayList arrayList) {
        arrayList.add(str + text);
    }

    public static void m(String str, AnalyticsEvent analyticsEvent, ArrayList arrayList) {
        arrayList.add(str + analyticsEvent);
    }

    public static void m(String str, Button button, ArrayList arrayList) {
        arrayList.add(str + button);
    }

    public static void m(String str, StyledText styledText, ArrayList arrayList) {
        arrayList.add(str + styledText);
    }

    public static void m(String str, TapAction tapAction, ArrayList arrayList) {
        arrayList.add(str + tapAction);
    }

    public static void m(String str, Image image, ArrayList arrayList) {
        arrayList.add(str + image);
    }

    public static void m(String str, Double d, ArrayList arrayList) {
        arrayList.add(str + d);
    }

    public static /* synthetic */ void m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, JobSupport jobSupport, Empty empty, Incomplete incomplete) {
        while (!atomicReferenceFieldUpdater.compareAndSet(jobSupport, empty, incomplete) && atomicReferenceFieldUpdater.get(jobSupport) == empty) {
        }
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, ChannelSegment channelSegment) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, channelSegment)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, BufferedChannel bufferedChannel, Segment segment, Segment segment2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, segment2)) {
            if (atomicReferenceFieldUpdater.get(bufferedChannel) != segment) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean m(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ConcurrentLinkedListNode concurrentLinkedListNode, Object obj, ConcurrentLinkedListNode concurrentLinkedListNode2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(concurrentLinkedListNode, obj, concurrentLinkedListNode2)) {
            if (atomicReferenceFieldUpdater.get(concurrentLinkedListNode) != obj) {
                return false;
            }
        }
        return true;
    }
}
