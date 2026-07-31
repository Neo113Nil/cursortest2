package androidx.work.impl.model;

import android.net.Uri;
import android.os.Build;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkTypeConverters.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u001c\u001d\u001e\u001fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0007J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0011H\u0007J\u0016\u0010\u0018\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0013H\u0007¨\u0006 "}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "()V", "backoffPolicyToInt", "", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "byteArrayToSetOfTriggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "bytes", "", "intToBackoffPolicy", "value", "intToNetworkType", "Landroidx/work/NetworkType;", "intToOutOfQuotaPolicy", "Landroidx/work/OutOfQuotaPolicy;", "intToState", "Landroidx/work/WorkInfo$State;", "networkTypeToInt", "networkType", "outOfQuotaPolicyToInt", "policy", "setOfTriggersToByteArray", "triggers", "stateToInt", "state", "BackoffPolicyIds", "NetworkTypeIds", "OutOfPolicyIds", "StateIds", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class WorkTypeConverters {
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class StateIds {
        public static final StateIds INSTANCE = new StateIds();

        private StateIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$BackoffPolicyIds;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class BackoffPolicyIds {
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();

        private BackoffPolicyIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$NetworkTypeIds;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class NetworkTypeIds {
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();

        private NetworkTypeIds() {
        }
    }

    /* compiled from: WorkTypeConverters.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$OutOfPolicyIds;", "", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class OutOfPolicyIds {
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();

        private OutOfPolicyIds() {
        }
    }

    public static final int stateToInt(WorkInfo.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final WorkInfo.State intToState(int value) {
        if (value == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    public static final int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final BackoffPolicy intToBackoffPolicy(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    public static final int networkTypeToInt(NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        int i2 = 2;
        if (i == 2) {
            return 1;
        }
        if (i != 3) {
            i2 = 4;
            if (i == 4) {
                return 3;
            }
            if (i != 5) {
                if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
                    return 5;
                }
                throw new IllegalArgumentException("Could not convert " + networkType + " to int");
            }
        }
        return i2;
    }

    public static final NetworkType intToNetworkType(int value) {
        if (value == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return NetworkType.CONNECTED;
        }
        if (value == 2) {
            return NetworkType.UNMETERED;
        }
        if (value == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    public static final int outOfQuotaPolicyToInt(OutOfQuotaPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    public static final byte[] setOfTriggersToByteArray(Set triggers) {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                Iterator it = triggers.iterator();
                while (it.hasNext()) {
                    Constraints.ContentUriTrigger contentUriTrigger = (Constraints.ContentUriTrigger) it.next();
                    objectOutputStream.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectOutputStream, null);
                CloseableKt.closeFinally(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "outputStream.toByteArray()");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final Set byteArrayToSetOfTriggers(byte[] bytes) {
        ObjectInputStream objectInputStream;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                objectInputStream = new ObjectInputStream(byteArrayInputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                int readInt = objectInputStream.readInt();
                for (int i = 0; i < readInt; i++) {
                    Uri uri = Uri.parse(objectInputStream.readUTF());
                    boolean readBoolean = objectInputStream.readBoolean();
                    Intrinsics.checkNotNullExpressionValue(uri, "uri");
                    linkedHashSet.add(new Constraints.ContentUriTrigger(uri, readBoolean));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(objectInputStream, null);
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(byteArrayInputStream, null);
                return linkedHashSet;
            } finally {
            }
        } finally {
        }
    }
}
