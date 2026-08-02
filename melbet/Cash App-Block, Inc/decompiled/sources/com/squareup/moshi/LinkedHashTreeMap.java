package com.squareup.moshi;

import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.constraintlayout.core.motion.utils.CurveFit;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.datatransport.runtime.TransportImpl$$ExternalSyntheticLambda0;
import com.google.android.filament.Box;
import com.google.android.gms.internal.measurement.zzacr;
import com.google.android.gms.internal.measurement.zzacv;
import com.google.android.gms.internal.measurement.zzadf;
import com.google.android.gms.internal.measurement.zzadu;
import com.google.android.gms.internal.measurement.zzadv;
import com.google.android.gms.internal.measurement.zzaef;
import com.google.android.gms.internal.measurement.zzaeg;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzaeq;
import com.google.android.gms.internal.measurement.zzaew;
import com.google.android.gms.internal.measurement.zzafl;
import com.google.android.gms.internal.measurement.zzafp;
import com.google.android.gms.internal.measurement.zzagm;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.maps.zzah;
import com.google.android.libraries.places.internal.zzbim;
import com.google.android.libraries.places.internal.zzbiq;
import com.google.android.libraries.places.internal.zzbjc;
import com.google.android.libraries.places.internal.zzbjs;
import com.google.android.libraries.places.internal.zzbkb;
import com.google.android.libraries.places.internal.zzbkd;
import com.google.android.libraries.places.internal.zzbke;
import com.google.android.libraries.places.internal.zzbkn;
import com.google.android.libraries.places.internal.zzbkt;
import com.google.android.libraries.places.internal.zzblj;
import com.google.android.libraries.places.internal.zzbln;
import com.google.android.libraries.places.internal.zzbmm;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.nimbusds.jose.shaded.gson.internal.LinkedTreeMap;
import com.squareup.cash.db2.profile.documents.AvailableAccountStatement;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.common.presenters.UtilsKt;
import com.squareup.cash.pools.backend.api.Participant;
import com.squareup.cash.pools.viewmodels.PoolListSection;
import com.squareup.cash.profile.devicemanager.backend.LoggedInDevice;
import com.squareup.cash.profile.presenters.Year;
import com.squareup.cash.recipients.data.Recipient;
import com.squareup.cash.support.chat.backend.api.Message;
import com.squareup.cash.userjourneys.data.CompletedJourney;
import com.squareup.cash.work.wages.real.EmployerIdentity;
import com.squareup.protos.cash.pools.PoolParticipant;
import com.squareup.protos.cash.recipientsuggestion.SuggestedRecipient;
import com.squareup.protos.cash.registrar.api.StatementCoverage;
import com.squareup.protos.timecards.scheduling.ShiftSchedule;
import com.squareup.wire.KotlinConstructorBuilder$build$ConstructorParam;
import com.stripe.android.financialconnections.model.PartnerAccount;
import com.stripe.android.model.CardBrand;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.chrisbanes.haze.HazeArea;
import io.noties.markwon.MarkwonConfiguration;
import java.io.Serializable;
import java.time.YearMonth;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.internal.ZipEntry;

/* loaded from: classes7.dex */
public final class LinkedHashTreeMap extends AbstractMap implements Serializable {
    public static final AnonymousClass1 NATURAL_ORDER = new AnonymousClass1(0);
    public KeySet entrySet;
    public KeySet keySet;
    public int size = 0;
    public int modCount = 0;
    public final Comparator comparator = NATURAL_ORDER;
    public final Node header = new Node();
    public Node[] table = new Node[16];
    public int threshold = 12;

    public final class KeySet extends AbstractSet {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ LinkedHashTreeMap this$0;

        public /* synthetic */ KeySet(LinkedHashTreeMap linkedHashTreeMap, int i) {
            this.$r8$classId = i;
            this.this$0 = linkedHashTreeMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            int i = this.$r8$classId;
            LinkedHashTreeMap linkedHashTreeMap = this.this$0;
            switch (i) {
                case 0:
                    linkedHashTreeMap.clear();
                    break;
                default:
                    linkedHashTreeMap.clear();
                    break;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0030 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean contains(Object obj) {
            Node find;
            Object obj2;
            Object value;
            int i = this.$r8$classId;
            LinkedHashTreeMap linkedHashTreeMap = this.this$0;
            switch (i) {
                case 0:
                    return linkedHashTreeMap.containsKey(obj);
                default:
                    if (!(obj instanceof Map.Entry)) {
                        return false;
                    }
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Node node = null;
                    if (key != null) {
                        try {
                            find = linkedHashTreeMap.find(key, false);
                        } catch (ClassCastException unused) {
                        }
                        if (find != null && ((obj2 = find.value) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                            node = find;
                        }
                        return node == null;
                    }
                    find = null;
                    if (find != null) {
                        node = find;
                    }
                    if (node == null) {
                    }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            int i = this.$r8$classId;
            LinkedHashTreeMap linkedHashTreeMap = this.this$0;
            switch (i) {
                case 0:
                    final int i2 = 0;
                    return new LinkedTreeMapIterator(linkedHashTreeMap) { // from class: com.squareup.moshi.LinkedHashTreeMap.KeySet.1
                        @Override // com.squareup.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
                        public Object next() {
                            switch (i2) {
                                case 0:
                                    return m3830nextNode().key;
                                default:
                                    return super.next();
                            }
                        }
                    };
                default:
                    final int i3 = 1;
                    return new LinkedTreeMapIterator(linkedHashTreeMap) { // from class: com.squareup.moshi.LinkedHashTreeMap.KeySet.1
                        @Override // com.squareup.moshi.LinkedHashTreeMap.LinkedTreeMapIterator, java.util.Iterator
                        public Object next() {
                            switch (i3) {
                                case 0:
                                    return m3830nextNode().key;
                                default:
                                    return super.next();
                            }
                        }
                    };
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean remove(Object obj) {
            Node find;
            Object obj2;
            Object value;
            int i = this.$r8$classId;
            Node node = null;
            LinkedHashTreeMap linkedHashTreeMap = this.this$0;
            switch (i) {
                case 0:
                    if (obj != null) {
                        try {
                            node = linkedHashTreeMap.find(obj, false);
                        } catch (ClassCastException unused) {
                        }
                    }
                    if (node != null) {
                        linkedHashTreeMap.removeInternal(node, true);
                    }
                    if (node != null) {
                        break;
                    }
                    break;
                default:
                    if (obj instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) obj;
                        Object key = entry.getKey();
                        if (key != null) {
                            try {
                                find = linkedHashTreeMap.find(key, false);
                            } catch (ClassCastException unused2) {
                            }
                            if (find != null && ((obj2 = find.value) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                                node = find;
                            }
                            if (node == null) {
                                linkedHashTreeMap.removeInternal(node, true);
                                break;
                            }
                        }
                        find = null;
                        if (find != null) {
                            node = find;
                        }
                        if (node == null) {
                        }
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            int i = this.$r8$classId;
            LinkedHashTreeMap linkedHashTreeMap = this.this$0;
            switch (i) {
            }
            return linkedHashTreeMap.size;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        Node node = this.header;
        Node node2 = node.next;
        while (node2 != node) {
            Node node3 = node2.next;
            node2.prev = null;
            node2.next = null;
            node2 = node3;
        }
        node.prev = node;
        node.next = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Node node = null;
        if (obj != null) {
            try {
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return node != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        KeySet keySet = this.entrySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet(this, 1);
        this.entrySet = keySet2;
        return keySet2;
    }

    public final Node find(Object obj, boolean z) {
        int i;
        Node node;
        boolean z2;
        Node node2;
        Node node3;
        Node node4;
        Node node5;
        Node node6;
        Node[] nodeArr = this.table;
        int hashCode = obj.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        boolean z3 = true;
        int length = i3 & (nodeArr.length - 1);
        Node node7 = nodeArr[length];
        AnonymousClass1 anonymousClass1 = NATURAL_ORDER;
        Node node8 = null;
        Comparator comparator = this.comparator;
        if (node7 != null) {
            Comparable comparable = comparator == anonymousClass1 ? (Comparable) obj : null;
            while (true) {
                Object obj2 = node7.key;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return node7;
                }
                Node node9 = i < 0 ? node7.left : node7.right;
                if (node9 == null) {
                    break;
                }
                node7 = node9;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node node10 = this.header;
        if (node7 != null) {
            Node node11 = node7;
            node = new Node(node11, obj, i3, node10, node10.prev);
            if (i < 0) {
                node11.left = node;
            } else {
                node11.right = node;
            }
            rebalance(node11, true);
        } else {
            if (comparator == anonymousClass1 && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            node = new Node(node7, obj, i3, node10, node10.prev);
            nodeArr[length] = node;
        }
        int i4 = this.size;
        this.size = i4 + 1;
        if (i4 > this.threshold) {
            Node[] nodeArr2 = this.table;
            int length2 = nodeArr2.length;
            int i5 = length2 * 2;
            Node[] nodeArr3 = new Node[i5];
            AvlBuilder avlBuilder = new AvlBuilder();
            AvlBuilder avlBuilder2 = new AvlBuilder();
            int i6 = 0;
            while (i6 < length2) {
                Node node12 = nodeArr2[i6];
                if (node12 == null) {
                    z2 = z3;
                    node3 = node8;
                } else {
                    Node node13 = node8;
                    for (Node node14 = node12; node14 != null; node14 = node14.left) {
                        node14.parent = node13;
                        node13 = node14;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (node13 != null) {
                            z2 = z3;
                            Node node15 = node13.parent;
                            node13.parent = node8;
                            Node node16 = node13.right;
                            while (true) {
                                Node node17 = node16;
                                node2 = node15;
                                node15 = node17;
                                if (node15 == null) {
                                    break;
                                }
                                node15.parent = node2;
                                node16 = node15.left;
                            }
                        } else {
                            Node node18 = node13;
                            node13 = node8;
                            node2 = node18;
                            z2 = z3;
                        }
                        if (node13 == null) {
                            break;
                        }
                        if ((node13.hash & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                        node13 = node2;
                        z3 = z2;
                        node8 = null;
                    }
                    avlBuilder.leavesToSkip = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    avlBuilder.size = 0;
                    avlBuilder.leavesSkipped = 0;
                    Node node19 = null;
                    avlBuilder.stack = null;
                    avlBuilder2.leavesToSkip = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    avlBuilder2.size = 0;
                    avlBuilder2.leavesSkipped = 0;
                    avlBuilder2.stack = null;
                    Node node20 = null;
                    while (node12 != null) {
                        node12.parent = node20;
                        Node node21 = node12;
                        node12 = node12.left;
                        node20 = node21;
                    }
                    while (true) {
                        if (node20 != null) {
                            Node node22 = node20.parent;
                            node20.parent = node19;
                            Node node23 = node20.right;
                            while (true) {
                                node6 = node22;
                                node22 = node23;
                                if (node22 == null) {
                                    break;
                                }
                                node22.parent = node6;
                                node23 = node22.left;
                            }
                            Node node24 = node20;
                            node20 = node6;
                            node19 = node24;
                        }
                        if (node19 == null) {
                            break;
                        }
                        if ((node19.hash & length2) == 0) {
                            avlBuilder.add(node19);
                        } else {
                            avlBuilder2.add(node19);
                        }
                        node19 = null;
                    }
                    if (i7 > 0) {
                        node4 = (Node) avlBuilder.stack;
                        if (node4.parent != null) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return null;
                        }
                        node3 = null;
                    } else {
                        node3 = null;
                        node4 = null;
                    }
                    nodeArr3[i6] = node4;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        node5 = (Node) avlBuilder2.stack;
                        if (node5.parent != null) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return node3;
                        }
                    } else {
                        node5 = node3;
                    }
                    nodeArr3[i9] = node5;
                }
                i6++;
                z3 = z2;
                node8 = node3;
            }
            this.table = nodeArr3;
            this.threshold = (i5 / 4) + (i5 / 2);
        }
        this.modCount++;
        return node;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node == null) {
                return node.value;
            }
            return null;
        }
        node = null;
        if (node == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        KeySet keySet2 = new KeySet(this, 0);
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2("key == null");
            return null;
        }
        Node find = find(obj, true);
        Object obj3 = find.value;
        find.value = obj2;
        return obj3;
    }

    public final void rebalance(Node node, boolean z) {
        while (node != null) {
            Node node2 = node.left;
            Node node3 = node.right;
            int i = node2 != null ? node2.height : 0;
            int i2 = node3 != null ? node3.height : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                Node node4 = node3.left;
                Node node5 = node3.right;
                int i4 = (node4 != null ? node4.height : 0) - (node5 != null ? node5.height : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    rotateRight(node3);
                }
                rotateLeft(node);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                Node node6 = node2.left;
                Node node7 = node2.right;
                int i5 = (node6 != null ? node6.height : 0) - (node7 != null ? node7.height : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    rotateLeft(node2);
                }
                rotateRight(node);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.height = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.height = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.parent;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = find(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node != null) {
                removeInternal(node, true);
            }
            if (node == null) {
                return node.value;
            }
            return null;
        }
        node = null;
        if (node != null) {
        }
        if (node == null) {
        }
    }

    public final void removeInternal(Node node, boolean z) {
        Node node2;
        Node node3;
        int i;
        if (z) {
            Node node4 = node.prev;
            node4.next = node.next;
            node.next.prev = node4;
            node.prev = null;
            node.next = null;
        }
        Node node5 = node.left;
        Node node6 = node.right;
        Node node7 = node.parent;
        int i2 = 0;
        if (node5 == null || node6 == null) {
            if (node5 != null) {
                replaceInParent(node, node5);
                node.left = null;
            } else if (node6 != null) {
                replaceInParent(node, node6);
                node.right = null;
            } else {
                replaceInParent(node, null);
            }
            rebalance(node7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (node5.height > node6.height) {
            Node node8 = node5.right;
            while (true) {
                Node node9 = node8;
                node3 = node5;
                node5 = node9;
                if (node5 == null) {
                    break;
                } else {
                    node8 = node5.right;
                }
            }
        } else {
            Node node10 = node6.left;
            while (true) {
                node2 = node6;
                node6 = node10;
                if (node6 == null) {
                    break;
                } else {
                    node10 = node6.left;
                }
            }
            node3 = node2;
        }
        removeInternal(node3, false);
        Node node11 = node.left;
        if (node11 != null) {
            i = node11.height;
            node3.left = node11;
            node11.parent = node3;
            node.left = null;
        } else {
            i = 0;
        }
        Node node12 = node.right;
        if (node12 != null) {
            i2 = node12.height;
            node3.right = node12;
            node12.parent = node3;
            node.right = null;
        }
        node3.height = Math.max(i, i2) + 1;
        replaceInParent(node, node3);
    }

    public final void replaceInParent(Node node, Node node2) {
        Node node3 = node.parent;
        node.parent = null;
        if (node2 != null) {
            node2.parent = node3;
        }
        if (node3 == null) {
            int i = node.hash;
            this.table[i & (r2.length - 1)] = node2;
        } else if (node3.left == node) {
            node3.left = node2;
        } else {
            node3.right = node2;
        }
    }

    public final void rotateLeft(Node node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node3.left;
        Node node5 = node3.right;
        node.right = node4;
        if (node4 != null) {
            node4.parent = node;
        }
        replaceInParent(node, node3);
        node3.left = node;
        node.parent = node3;
        int max = Math.max(node2 != null ? node2.height : 0, node4 != null ? node4.height : 0) + 1;
        node.height = max;
        node3.height = Math.max(max, node5 != null ? node5.height : 0) + 1;
    }

    public final void rotateRight(Node node) {
        Node node2 = node.left;
        Node node3 = node.right;
        Node node4 = node2.left;
        Node node5 = node2.right;
        node.left = node5;
        if (node5 != null) {
            node5.parent = node;
        }
        replaceInParent(node, node2);
        node2.right = node;
        node.parent = node2;
        int max = Math.max(node3 != null ? node3.height : 0, node5 != null ? node5.height : 0) + 1;
        node.height = max;
        node2.height = Math.max(max, node4 != null ? node4.height : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$1, reason: invalid class name */
    public final class AnonymousClass1 implements Comparator {
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass1(MarkwonConfiguration markwonConfiguration) {
            this.$r8$classId = 16;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num;
            StatementCoverage.Annual annual;
            StatementCoverage.Annual annual2;
            StatementCoverage.Monthly monthly;
            Integer num2;
            StatementCoverage.Monthly monthly2;
            switch (this.$r8$classId) {
                case 0:
                    return ((Comparable) obj).compareTo((Comparable) obj2);
                case 1:
                    return ComparisonsKt__ComparisonsKt.compareValues(Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaychecksUiState.RealizedAllocationAmount) obj).destination)), Boolean.valueOf(UtilsKt.sortOrderForDistributionWheel(((PaychecksUiState.RealizedAllocationAmount) obj2).destination)));
                case 2:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Participant) obj).addedAt, ((Participant) obj2).addedAt);
                case 3:
                    return ComparisonsKt__ComparisonsKt.compareValues(((PoolParticipant) obj).added_at, ((PoolParticipant) obj2).added_at);
                case 4:
                    return ComparisonsKt__ComparisonsKt.compareValues(((PoolParticipant) obj).added_at, ((PoolParticipant) obj2).added_at);
                case 5:
                    return ComparisonsKt__ComparisonsKt.compareValues(((PoolListSection.PoolListPerson) obj).displayName, ((PoolListSection.PoolListPerson) obj2).displayName);
                case 6:
                    return ComparisonsKt__ComparisonsKt.compareValues(((PoolParticipant) obj).added_at, ((PoolParticipant) obj2).added_at);
                case 7:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((LoggedInDevice) obj2).lastLogin.timestampMillis), Long.valueOf(((LoggedInDevice) obj).lastLogin.timestampMillis));
                case 8:
                    StatementCoverage statementCoverage = ((AvailableAccountStatement) obj).statementCoverage;
                    statementCoverage.getClass();
                    zzko zzkoVar = statementCoverage.f1334type;
                    Integer num3 = null;
                    if (zzkoVar == null || (monthly2 = CurveFit.getMonthly(zzkoVar)) == null || (num = monthly2.year) == null) {
                        num = (zzkoVar == null || (annual = CurveFit.getAnnual(zzkoVar)) == null) ? null : annual.year;
                    }
                    Year year = new Year(num);
                    StatementCoverage statementCoverage2 = ((AvailableAccountStatement) obj2).statementCoverage;
                    statementCoverage2.getClass();
                    zzko zzkoVar2 = statementCoverage2.f1334type;
                    if (zzkoVar2 != null && (monthly = CurveFit.getMonthly(zzkoVar2)) != null && (num2 = monthly.year) != null) {
                        num3 = num2;
                    } else if (zzkoVar2 != null && (annual2 = CurveFit.getAnnual(zzkoVar2)) != null) {
                        num3 = annual2.year;
                    }
                    return ComparisonsKt__ComparisonsKt.compareValues(year, new Year(num3));
                case 9:
                    return ComparisonsKt__ComparisonsKt.compareValues(((SuggestedRecipient) obj2).score, ((SuggestedRecipient) obj).score);
                case 10:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Recipient) obj).displayName, ((Recipient) obj2).displayName);
                case 11:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Recipient) obj).displayName, ((Recipient) obj2).displayName);
                case 12:
                    return ComparisonsKt__ComparisonsKt.compareValues((String) obj, (String) obj2);
                case 13:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Message) obj).getTimestamp(), ((Message) obj2).getTimestamp());
                case 14:
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((CompletedJourney) obj2).getJourney().getCreatedAtEpoch()), Long.valueOf(((CompletedJourney) obj).getJourney().getCreatedAtEpoch()));
                case 15:
                    return ComparisonsKt__ComparisonsKt.compareValues((YearMonth) obj2, (YearMonth) obj);
                case 16:
                    return ComparisonsKt__ComparisonsKt.compareValues(MarkwonConfiguration.getStartDateTime((ShiftSchedule) obj), MarkwonConfiguration.getStartDateTime((ShiftSchedule) obj2));
                case 17:
                    return String.CASE_INSENSITIVE_ORDER.compare(((EmployerIdentity) obj).name, ((EmployerIdentity) obj2).name);
                case 18:
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((KotlinConstructorBuilder$build$ConstructorParam) obj).schemaIndex), Integer.valueOf(((KotlinConstructorBuilder$build$ConstructorParam) obj2).schemaIndex));
                case 19:
                    Boolean valueOf = Boolean.valueOf(!(((PartnerAccount) obj)._allowSelection != null ? r2.booleanValue() : true));
                    Boolean bool = ((PartnerAccount) obj2)._allowSelection;
                    return ComparisonsKt__ComparisonsKt.compareValues(valueOf, Boolean.valueOf(true ^ (bool != null ? bool.booleanValue() : true)));
                case 20:
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((CardBrand) obj).renderingOrder), Integer.valueOf(((CardBrand) obj2).renderingOrder));
                case 21:
                    CameraChoice cameraChoice = (CameraChoice) obj2;
                    CameraChoice cameraChoice2 = (CameraChoice) obj;
                    return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(cameraChoice.size.getHeight() * cameraChoice.size.getWidth()), Integer.valueOf(cameraChoice2.size.getHeight() * cameraChoice2.size.getWidth()));
                case 22:
                    return ComparisonsKt__ComparisonsKt.compareValues(((Option) obj).text, ((Option) obj2).text);
                case 23:
                    return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(((HazeArea) obj).zIndex$delegate.getFloatValue()), Float.valueOf(((HazeArea) obj2).zIndex$delegate.getFloatValue()));
                case 24:
                    return ComparisonsKt__ComparisonsKt.compareValues(((ZipEntry) obj).canonicalPath, ((ZipEntry) obj2).canonicalPath);
                default:
                    return ComparisonsKt__ComparisonsKt.compareValues(((SemanticsPropertyKey) ((Map.Entry) obj).getKey()).name, ((SemanticsPropertyKey) ((Map.Entry) obj2).getKey()).name);
            }
        }

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }
    }

    /* loaded from: classes4.dex */
    public final class AvlBuilder {
        public final /* synthetic */ int $r8$classId;
        public int leavesSkipped;
        public int leavesToSkip;
        public int size;
        public Object stack;

        public AvlBuilder(int i, int i2) {
            this.$r8$classId = 3;
            this.leavesToSkip = i;
            this.leavesSkipped = i2;
            int i3 = i * i2;
            this.size = i3;
            this.stack = new float[i3 * 8];
        }

        public static final void zzW(int i) {
            if ((i & 3) == 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Failed to parse the message.");
        }

        public static final void zzZ(int i) {
            if ((i & 3) == 0) {
                return;
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m("Failed to parse the message.");
        }

        public static AvlBuilder zza(zzacv zzacvVar) {
            AvlBuilder avlBuilder = (AvlBuilder) zzacvVar.zzd;
            return avlBuilder != null ? avlBuilder : new AvlBuilder(zzacvVar);
        }

        public static final void zzaa(int i) {
            if ((i & 7) == 0) {
                return;
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m("Failed to parse the message.");
        }

        public void add(Node node) {
            node.right = null;
            node.parent = null;
            node.left = null;
            node.height = 1;
            int i = this.leavesToSkip;
            if (i > 0) {
                int i2 = this.size;
                if ((i2 & 1) == 0) {
                    this.size = i2 + 1;
                    this.leavesToSkip = i - 1;
                    this.leavesSkipped++;
                }
            }
            node.parent = (Node) this.stack;
            this.stack = node;
            int i3 = this.size;
            int i4 = i3 + 1;
            this.size = i4;
            int i5 = this.leavesToSkip;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.size = i3 + 2;
                this.leavesToSkip = i5 - 1;
                this.leavesSkipped++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.size & i7) != i7) {
                    return;
                }
                int i8 = this.leavesSkipped;
                if (i8 == 0) {
                    Node node2 = (Node) this.stack;
                    Node node3 = node2.parent;
                    Node node4 = node3.parent;
                    node3.parent = node4.parent;
                    this.stack = node3;
                    node3.left = node4;
                    node3.right = node2;
                    node3.height = node2.height + 1;
                    node4.parent = node3;
                    node2.parent = node3;
                } else if (i8 == 1) {
                    Node node5 = (Node) this.stack;
                    Node node6 = node5.parent;
                    this.stack = node6;
                    node6.right = node5;
                    node6.height = node5.height + 1;
                    node5.parent = node6;
                    this.leavesSkipped = 0;
                } else if (i8 == 2) {
                    this.leavesSkipped = 0;
                }
                i6 *= 2;
            }
        }

        public void zzA(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzaeq;
            int i2 = this.leavesToSkip;
            if (z) {
                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaeqVar.zzf(zzacvVar.zzg());
                    } while (zzacvVar.zzH() < zzH);
                    zzV(zzH);
                    return;
                }
                do {
                    zzaeqVar.zzf(zzacvVar.zzg());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaefVar.add(Long.valueOf(zzacvVar.zzg()));
                    } while (zzacvVar.zzH() < zzH2);
                    zzV(zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.zzg()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzB(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzadvVar.zzh(zzacvVar.zzh());
                    } while (zzacvVar.zzH() < zzH);
                    zzV(zzH);
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzh());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaefVar.add(Integer.valueOf(zzacvVar.zzh()));
                    } while (zzacvVar.zzH() < zzH2);
                    zzV(zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzh()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzC(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzaeq;
            int i2 = this.leavesToSkip;
            if (z) {
                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 1) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzp = zzacvVar.zzp();
                    zzX(zzp);
                    int zzH = zzacvVar.zzH() + zzp;
                    do {
                        zzaeqVar.zzf(zzacvVar.zzi());
                    } while (zzacvVar.zzH() < zzH);
                    return;
                }
                do {
                    zzaeqVar.zzf(zzacvVar.zzi());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzp2 = zzacvVar.zzp();
                    zzX(zzp2);
                    int zzH2 = zzacvVar.zzH() + zzp2;
                    do {
                        zzaefVar.add(Long.valueOf(zzacvVar.zzi()));
                    } while (zzacvVar.zzH() < zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.zzi()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzD(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 == 2) {
                    int zzp = zzacvVar.zzp();
                    zzW(zzp);
                    int zzH = zzacvVar.zzH() + zzp;
                    do {
                        zzadvVar.zzh(zzacvVar.zzj());
                    } while (zzacvVar.zzH() < zzH);
                    return;
                }
                if (i3 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzj());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 == 2) {
                    int zzp2 = zzacvVar.zzp();
                    zzW(zzp2);
                    int zzH2 = zzacvVar.zzH() + zzp2;
                    do {
                        zzaefVar.add(Integer.valueOf(zzacvVar.zzj()));
                    } while (zzacvVar.zzH() < zzH2);
                    return;
                }
                if (i4 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzj()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzE(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbkn;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbkn zzbknVar = (zzbkn) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 1) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzo = zzbiqVar.zzo();
                    zzaa(zzo);
                    int zzE = zzbiqVar.zzE() + zzo;
                    do {
                        zzbknVar.zzf(zzbiqVar.zzi());
                    } while (zzbiqVar.zzE() < zzE);
                    return;
                }
                do {
                    zzbknVar.zzf(zzbiqVar.zzi());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzo2 = zzbiqVar.zzo();
                    zzaa(zzo2);
                    int zzE2 = zzbiqVar.zzE() + zzo2;
                    do {
                        zzbkbVar.add(Long.valueOf(zzbiqVar.zzi()));
                    } while (zzbiqVar.zzE() < zzE2);
                    return;
                }
                do {
                    zzbkbVar.add(Long.valueOf(zzbiqVar.zzi()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzF(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 == 2) {
                    int zzo = zzbiqVar.zzo();
                    zzZ(zzo);
                    int zzE = zzbiqVar.zzE() + zzo;
                    do {
                        zzbjsVar.zzh(zzbiqVar.zzj());
                    } while (zzbiqVar.zzE() < zzE);
                    return;
                }
                if (i3 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzj());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 == 2) {
                    int zzo2 = zzbiqVar.zzo();
                    zzZ(zzo2);
                    int zzE2 = zzbiqVar.zzE() + zzo2;
                    do {
                        zzbkbVar.add(Integer.valueOf(zzbiqVar.zzj()));
                    } while (zzbiqVar.zzE() < zzE2);
                    return;
                }
                if (i4 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzj()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzG(zzbkb zzbkbVar) {
            int zza;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 0) {
                do {
                    zzbkbVar.add(Boolean.valueOf(zzbiqVar.zzk()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                this.size = zza;
                return;
            }
            if (i != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return;
            }
            int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
            do {
                zzbkbVar.add(Boolean.valueOf(zzbiqVar.zzk()));
            } while (zzbiqVar.zzE() < zzE);
            zzY(zzE);
        }

        public void zzH(zzbkb zzbkbVar, boolean z) {
            String zzl;
            int zza;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            if ((this.leavesToSkip & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return;
            }
            do {
                if (z) {
                    zzS(2);
                    zzl = zzbiqVar.zzm();
                } else {
                    zzS(2);
                    zzl = zzbiqVar.zzl();
                }
                zzbkbVar.add(zzl);
                if (zzbiqVar.zzD()) {
                    return;
                } else {
                    zza = zzbiqVar.zza();
                }
            } while (zza == this.leavesToSkip);
            this.size = zza;
        }

        public void zzI(zzbkb zzbkbVar, zzbln zzblnVar, zzbjc zzbjcVar) {
            int zza;
            int i = this.leavesToSkip;
            if ((i & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return;
            }
            do {
                Object zza2 = zzblnVar.zza();
                zzT(zza2, zzblnVar, zzbjcVar);
                zzblnVar.zzh(zza2);
                zzbkbVar.add(zza2);
                zzbiq zzbiqVar = (zzbiq) this.stack;
                if (zzbiqVar.zzD() || this.size != 0) {
                    return;
                } else {
                    zza = zzbiqVar.zza();
                }
            } while (zza == i);
            this.size = zza;
        }

        public void zzJ(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzadvVar.zzh(zzacvVar.zzp());
                    } while (zzacvVar.zzH() < zzH);
                    zzV(zzH);
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzp());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaefVar.add(Integer.valueOf(zzacvVar.zzp()));
                    } while (zzacvVar.zzH() < zzH2);
                    zzV(zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzp()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzK(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzadvVar.zzh(zzacvVar.zzq());
                    } while (zzacvVar.zzH() < zzH);
                    zzV(zzH);
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzq());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaefVar.add(Integer.valueOf(zzacvVar.zzq()));
                    } while (zzacvVar.zzH() < zzH2);
                    zzV(zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzq()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzL(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 == 2) {
                    int zzp = zzacvVar.zzp();
                    zzW(zzp);
                    int zzH = zzacvVar.zzH() + zzp;
                    do {
                        zzadvVar.zzh(zzacvVar.zzr());
                    } while (zzacvVar.zzH() < zzH);
                    return;
                }
                if (i3 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzr());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 == 2) {
                    int zzp2 = zzacvVar.zzp();
                    zzW(zzp2);
                    int zzH2 = zzacvVar.zzH() + zzp2;
                    do {
                        zzaefVar.add(Integer.valueOf(zzacvVar.zzr()));
                    } while (zzacvVar.zzH() < zzH2);
                    return;
                }
                if (i4 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzr()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzM(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzaeq;
            int i2 = this.leavesToSkip;
            if (z) {
                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 1) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzp = zzacvVar.zzp();
                    zzX(zzp);
                    int zzH = zzacvVar.zzH() + zzp;
                    do {
                        zzaeqVar.zzf(zzacvVar.zzs());
                    } while (zzacvVar.zzH() < zzH);
                    return;
                }
                do {
                    zzaeqVar.zzf(zzacvVar.zzs());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzp2 = zzacvVar.zzp();
                    zzX(zzp2);
                    int zzH2 = zzacvVar.zzH() + zzp2;
                    do {
                        zzaefVar.add(Long.valueOf(zzacvVar.zzs()));
                    } while (zzacvVar.zzH() < zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.zzs()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzN(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 == 2) {
                    int zzo = zzbiqVar.zzo();
                    zzZ(zzo);
                    int zzE = zzbiqVar.zzE() + zzo;
                    do {
                        zzbjsVar.zzh(zzbiqVar.zzq());
                    } while (zzbiqVar.zzE() < zzE);
                    return;
                }
                if (i3 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzq());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 == 2) {
                    int zzo2 = zzbiqVar.zzo();
                    zzZ(zzo2);
                    int zzE2 = zzbiqVar.zzE() + zzo2;
                    do {
                        zzbkbVar.add(Integer.valueOf(zzbiqVar.zzq()));
                    } while (zzbiqVar.zzE() < zzE2);
                    return;
                }
                if (i4 != 5) {
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzq()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzO(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbkn;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbkn zzbknVar = (zzbkn) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 1) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzo = zzbiqVar.zzo();
                    zzaa(zzo);
                    int zzE = zzbiqVar.zzE() + zzo;
                    do {
                        zzbknVar.zzf(zzbiqVar.zzr());
                    } while (zzbiqVar.zzE() < zzE);
                    return;
                }
                do {
                    zzbknVar.zzf(zzbiqVar.zzr());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 1) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzo2 = zzbiqVar.zzo();
                    zzaa(zzo2);
                    int zzE2 = zzbiqVar.zzE() + zzo2;
                    do {
                        zzbkbVar.add(Long.valueOf(zzbiqVar.zzr()));
                    } while (zzbiqVar.zzE() < zzE2);
                    return;
                }
                do {
                    zzbkbVar.add(Long.valueOf(zzbiqVar.zzr()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzP(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                    do {
                        zzbjsVar.zzh(zzbiqVar.zzs());
                    } while (zzbiqVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzs());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                    do {
                        zzbkbVar.add(Integer.valueOf(zzbiqVar.zzs()));
                    } while (zzbiqVar.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzs()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzQ(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbkn;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbkn zzbknVar = (zzbkn) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                    do {
                        zzbknVar.zzf(zzbiqVar.zzt());
                    } while (zzbiqVar.zzE() < zzE);
                    zzY(zzE);
                    return;
                }
                do {
                    zzbknVar.zzf(zzbiqVar.zzt());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m$1();
                        return;
                    }
                    int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                    do {
                        zzbkbVar.add(Long.valueOf(zzbiqVar.zzt()));
                    } while (zzbiqVar.zzE() < zzE2);
                    zzY(zzE2);
                    return;
                }
                do {
                    zzbkbVar.add(Long.valueOf(zzbiqVar.zzt()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
        
            r10.put(r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x006a, code lost:
        
            r1.zzC(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x006d, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void zzR(zzbkt zzbktVar, Box box, zzbjc zzbjcVar) {
            zzS(2);
            zzbiq zzbiqVar = (zzbiq) this.stack;
            int zzB = zzbiqVar.zzB(zzbiqVar.zzo());
            box.getClass();
            Long l = 0L;
            Object obj = l;
            Object obj2 = obj;
            while (true) {
                try {
                    int zzb = zzb();
                    if (zzb == Integer.MAX_VALUE || zzbiqVar.zzD()) {
                        break;
                    }
                    if (zzb == 1) {
                        obj = zzX((zzbmm) box.mCenter, null, null);
                    } else if (zzb != 2) {
                        try {
                            if (!zzd()) {
                                throw new zzbke("Unable to parse map entry.");
                            }
                        } catch (zzbkd e) {
                            if (!zzd()) {
                                throw new zzbke("Unable to parse map entry.", e);
                            }
                        }
                    } else {
                        obj2 = zzX((zzbmm) box.mHalfExtent, l.getClass(), zzbjcVar);
                    }
                } catch (Throwable th) {
                    zzbiqVar.zzC(zzB);
                    throw th;
                }
            }
        }

        public void zzS(int i) {
            if ((this.leavesToSkip & 7) == i) {
                return;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1();
        }

        public void zzT(Object obj, zzbln zzblnVar, zzbjc zzbjcVar) {
            zzbiq zzbiqVar = (zzbiq) this.stack;
            int zzo = zzbiqVar.zzo();
            if (zzbiqVar.zza + zzbiqVar.zzb >= 100) {
                AesGcmSiv$$ExternalSyntheticLambda0.m("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            }
            int zzB = zzbiqVar.zzB(zzo);
            zzbiqVar.zza++;
            zzblnVar.zzg(obj, this, zzbjcVar);
            zzbiqVar.zzb(0);
            zzbiqVar.zza--;
            zzbiqVar.zzC(zzB);
        }

        public Object zzU(zzagm zzagmVar, Class cls, zzadf zzadfVar) {
            zzacv zzacvVar = (zzacv) this.stack;
            zzagm zzagmVar2 = zzagm.zzi;
            switch (zzagmVar.ordinal()) {
                case 0:
                    zzQ(1);
                    return Double.valueOf(zzacvVar.zzd());
                case 1:
                    zzQ(5);
                    return Float.valueOf(zzacvVar.zze());
                case 2:
                    zzQ(0);
                    return Long.valueOf(zzacvVar.zzg());
                case 3:
                    zzQ(0);
                    return Long.valueOf(zzacvVar.zzf());
                case 4:
                    zzQ(0);
                    return Integer.valueOf(zzacvVar.zzh());
                case 5:
                    zzQ(1);
                    return Long.valueOf(zzacvVar.zzi());
                case 6:
                    zzQ(5);
                    return Integer.valueOf(zzacvVar.zzj());
                case 7:
                    zzQ(0);
                    return Boolean.valueOf(zzacvVar.zzk());
                case 8:
                    zzQ(2);
                    return zzacvVar.zzm();
                case 9:
                default:
                    a$$ExternalSyntheticBUOutline0.m$3("unsupported field type.");
                    return null;
                case 10:
                    zzQ(2);
                    zzafp zzb = zzafl.zza.zzb(cls);
                    zzadu zza = zzb.zza();
                    zzR(zza, zzb, zzadfVar);
                    zzb.zzk(zza);
                    return zza;
                case 11:
                    return zzq();
                case 12:
                    zzQ(0);
                    return Integer.valueOf(zzacvVar.zzp());
                case 13:
                    zzQ(0);
                    return Integer.valueOf(zzacvVar.zzq());
                case 14:
                    zzQ(5);
                    return Integer.valueOf(zzacvVar.zzr());
                case 15:
                    zzQ(1);
                    return Long.valueOf(zzacvVar.zzs());
                case 16:
                    zzQ(0);
                    return Integer.valueOf(zzacvVar.zzt());
                case 17:
                    zzQ(0);
                    return Long.valueOf(zzacvVar.zzu());
            }
        }

        public void zzV(Object obj, zzbln zzblnVar, zzbjc zzbjcVar) {
            int i = this.leavesSkipped;
            this.leavesSkipped = ((this.leavesToSkip >>> 3) << 3) | 4;
            try {
                zzblnVar.zzg(obj, this, zzbjcVar);
                if (this.leavesToSkip == this.leavesSkipped) {
                } else {
                    throw new zzbke("Failed to parse the message.");
                }
            } finally {
                this.leavesSkipped = i;
            }
        }

        public Object zzX(zzbmm zzbmmVar, Class cls, zzbjc zzbjcVar) {
            zzbiq zzbiqVar = (zzbiq) this.stack;
            zzbmm zzbmmVar2 = zzbmm.zzc;
            switch (zzbmmVar.ordinal()) {
                case 0:
                    zzS(1);
                    return Double.valueOf(zzbiqVar.zzd());
                case 1:
                    zzS(5);
                    return Float.valueOf(zzbiqVar.zze());
                case 2:
                    zzS(0);
                    return Long.valueOf(zzbiqVar.zzg());
                case 3:
                    zzS(0);
                    return Long.valueOf(zzbiqVar.zzf());
                case 4:
                    zzS(0);
                    return Integer.valueOf(zzbiqVar.zzh());
                case 5:
                    zzS(1);
                    return Long.valueOf(zzbiqVar.zzi());
                case 6:
                    zzS(5);
                    return Integer.valueOf(zzbiqVar.zzj());
                case 7:
                    zzS(0);
                    return Boolean.valueOf(zzbiqVar.zzk());
                case 8:
                    zzS(2);
                    return zzbiqVar.zzm();
                case 9:
                default:
                    a$$ExternalSyntheticBUOutline0.m$3("unsupported field type.");
                    return null;
                case 10:
                    zzS(2);
                    zzbln zzb = zzblj.zza.zzb(cls);
                    Object zza = zzb.zza();
                    zzT(zza, zzb, zzbjcVar);
                    zzb.zzh(zza);
                    return zza;
                case 11:
                    return zzs();
                case 12:
                    zzS(0);
                    return Integer.valueOf(zzbiqVar.zzo());
                case 13:
                    zzS(0);
                    return Integer.valueOf(zzbiqVar.zzp());
                case 14:
                    zzS(5);
                    return Integer.valueOf(zzbiqVar.zzq());
                case 15:
                    zzS(1);
                    return Long.valueOf(zzbiqVar.zzr());
                case 16:
                    zzS(0);
                    return Integer.valueOf(zzbiqVar.zzs());
                case 17:
                    zzS(0);
                    return Long.valueOf(zzbiqVar.zzt());
            }
        }

        public void zzY(int i) {
            if (((zzbiq) this.stack).zzE() == i) {
                return;
            }
            AesGcmSiv$$ExternalSyntheticLambda0.m("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        public int zzb() {
            switch (this.$r8$classId) {
                case 1:
                    int i = this.size;
                    if (i != 0) {
                        this.leavesToSkip = i;
                        this.size = 0;
                    } else {
                        i = ((zzacv) this.stack).zza();
                        this.leavesToSkip = i;
                    }
                    if (i == 0 || i == this.leavesSkipped) {
                        return Integer.MAX_VALUE;
                    }
                    return i >>> 3;
                default:
                    int i2 = this.size;
                    if (i2 != 0) {
                        this.leavesToSkip = i2;
                        this.size = 0;
                    } else {
                        i2 = ((zzbiq) this.stack).zza();
                        this.leavesToSkip = i2;
                    }
                    if (i2 == 0 || i2 == this.leavesSkipped) {
                        return Integer.MAX_VALUE;
                    }
                    return i2 >>> 3;
            }
        }

        public boolean zzd() {
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            if (zzbiqVar.zzD() || (i = this.leavesToSkip) == this.leavesSkipped) {
                return false;
            }
            return zzbiqVar.zzc(i);
        }

        public zzacr zzq() {
            zzQ(2);
            return ((zzacv) this.stack).zzn();
        }

        public zzbim zzs() {
            zzS(2);
            return ((zzbiq) this.stack).zzn();
        }

        public void zzx(zzaef zzaefVar) {
            int zza;
            zzacv zzacvVar = (zzacv) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 1) {
                do {
                    zzaefVar.add(Double.valueOf(zzacvVar.zzd()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                this.size = zza;
                return;
            }
            if (i != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            int zzp = zzacvVar.zzp();
            zzX(zzp);
            int zzH = zzacvVar.zzH() + zzp;
            do {
                zzaefVar.add(Double.valueOf(zzacvVar.zzd()));
            } while (zzacvVar.zzH() < zzH);
        }

        public void zzy(zzaef zzaefVar) {
            int zza;
            zzacv zzacvVar = (zzacv) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 2) {
                int zzp = zzacvVar.zzp();
                zzW(zzp);
                int zzH = zzacvVar.zzH() + zzp;
                do {
                    zzaefVar.add(Float.valueOf(zzacvVar.zze()));
                } while (zzacvVar.zzH() < zzH);
                return;
            }
            if (i != 5) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            do {
                zzaefVar.add(Float.valueOf(zzacvVar.zze()));
                if (zzacvVar.zzG()) {
                    return;
                } else {
                    zza = zzacvVar.zza();
                }
            } while (zza == this.leavesToSkip);
            this.size = zza;
        }

        public void zzz(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzaeq;
            int i2 = this.leavesToSkip;
            if (z) {
                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaeqVar.zzf(zzacvVar.zzf());
                    } while (zzacvVar.zzH() < zzH);
                    zzV(zzH);
                    return;
                }
                do {
                    zzaeqVar.zzf(zzacvVar.zzf());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 != 2) {
                        TransportImpl$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                    do {
                        zzaefVar.add(Long.valueOf(zzacvVar.zzf()));
                    } while (zzacvVar.zzH() < zzH2);
                    zzV(zzH2);
                    return;
                }
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.zzf()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public AvlBuilder(zzacv zzacvVar) {
            this.$r8$classId = 1;
            this.size = 0;
            this.stack = zzacvVar;
            zzacvVar.zzd = this;
        }

        public AvlBuilder(zzbiq zzbiqVar) {
            this.$r8$classId = 2;
            this.size = 0;
            this.stack = zzbiqVar;
            zzbiqVar.zze = this;
        }

        public /* synthetic */ AvlBuilder() {
            this.$r8$classId = 0;
        }

        public void zzV(int i) {
            if (((zzacv) this.stack).zzH() == i) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        public void zzI(zzaef zzaefVar) {
            int zza;
            if ((this.leavesToSkip & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            do {
                zzaefVar.add(zzq());
                zzacv zzacvVar = (zzacv) this.stack;
                if (zzacvVar.zzG()) {
                    return;
                } else {
                    zza = zzacvVar.zza();
                }
            } while (zza == this.leavesToSkip);
            this.size = zza;
        }

        public void zzT(Object obj, zzafp zzafpVar, zzadf zzadfVar) {
            int i = this.leavesSkipped;
            this.leavesSkipped = ((this.leavesToSkip >>> 3) << 3) | 4;
            try {
                zzafpVar.zzg(obj, this, zzadfVar);
                if (this.leavesToSkip == this.leavesSkipped) {
                } else {
                    throw new zzaeh("Failed to parse the message.");
                }
            } finally {
                this.leavesSkipped = i;
            }
        }

        public void zzH(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) {
            int zza;
            int i = this.leavesToSkip;
            if ((i & 7) != 3) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            do {
                zzadu zza2 = zzafpVar.zza();
                zzT(zza2, zzafpVar, zzadfVar);
                zzafpVar.zzk(zza2);
                zzaefVar.add(zza2);
                zzacv zzacvVar = (zzacv) this.stack;
                if (zzacvVar.zzG() || this.size != 0) {
                    return;
                } else {
                    zza = zzacvVar.zza();
                }
            } while (zza == i);
            this.size = zza;
        }

        public void zzG(zzaef zzaefVar, zzafp zzafpVar, zzadf zzadfVar) {
            int zza;
            int i = this.leavesToSkip;
            if ((i & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            do {
                zzadu zza2 = zzafpVar.zza();
                zzR(zza2, zzafpVar, zzadfVar);
                zzafpVar.zzk(zza2);
                zzaefVar.add(zza2);
                zzacv zzacvVar = (zzacv) this.stack;
                if (zzacvVar.zzG() || this.size != 0) {
                    return;
                } else {
                    zza = zzacvVar.zza();
                }
            } while (zza == i);
            this.size = zza;
        }

        public void zzR(Object obj, zzafp zzafpVar, zzadf zzadfVar) {
            zzacv zzacvVar = (zzacv) this.stack;
            int zzp = zzacvVar.zzp();
            if (zzacvVar.zza + zzacvVar.zzb < 100) {
                int zzD = zzacvVar.zzD(zzp);
                zzacvVar.zza++;
                zzafpVar.zzg(obj, this, zzadfVar);
                zzacvVar.zzb(0);
                zzacvVar.zza--;
                zzacvVar.zzE(zzD);
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }

        public void zzA(zzbkb zzbkbVar) {
            int zza;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 2) {
                int zzo = zzbiqVar.zzo();
                zzZ(zzo);
                int zzE = zzbiqVar.zzE() + zzo;
                do {
                    zzbkbVar.add(Float.valueOf(zzbiqVar.zze()));
                } while (zzbiqVar.zzE() < zzE);
                return;
            }
            if (i == 5) {
                do {
                    zzbkbVar.add(Float.valueOf(zzbiqVar.zze()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                this.size = zza;
                return;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1();
        }

        public void zzB(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbkn;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbkn zzbknVar = (zzbkn) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbknVar.zzf(zzbiqVar.zzf());
                        } while (zzbiqVar.zzE() < zzE);
                        zzY(zzE);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbknVar.zzf(zzbiqVar.zzf());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbkbVar.add(Long.valueOf(zzbiqVar.zzf()));
                        } while (zzbiqVar.zzE() < zzE2);
                        zzY(zzE2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Long.valueOf(zzbiqVar.zzf()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzJ(zzbkb zzbkbVar, zzbln zzblnVar, zzbjc zzbjcVar) {
            int zza;
            int i = this.leavesToSkip;
            if ((i & 7) != 3) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return;
            }
            do {
                Object zza2 = zzblnVar.zza();
                zzV(zza2, zzblnVar, zzbjcVar);
                zzblnVar.zzh(zza2);
                zzbkbVar.add(zza2);
                zzbiq zzbiqVar = (zzbiq) this.stack;
                if (zzbiqVar.zzD() || this.size != 0) {
                    return;
                } else {
                    zza = zzbiqVar.zza();
                }
            } while (zza == i);
            this.size = zza;
        }

        public void zzK(zzbkb zzbkbVar) {
            int zza;
            if ((this.leavesToSkip & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m$1();
                return;
            }
            do {
                zzbkbVar.add(zzs());
                zzbiq zzbiqVar = (zzbiq) this.stack;
                if (zzbiqVar.zzD()) {
                    return;
                } else {
                    zza = zzbiqVar.zza();
                }
            } while (zza == this.leavesToSkip);
            this.size = zza;
        }

        /* JADX WARN: Code restructure failed: missing block: B:51:0x007e, code lost:
        
            r12.put(r4, r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0081, code lost:
        
            r1.zzE(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0042 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void zzP(zzaew zzaewVar, zzah zzahVar, zzadf zzadfVar) {
            int i;
            boolean z;
            int i2;
            zzQ(2);
            zzacv zzacvVar = (zzacv) this.stack;
            int zzD = zzacvVar.zzD(zzacvVar.zzp());
            Object obj = zzahVar.zzc;
            Object obj2 = "";
            Object obj3 = obj;
            while (true) {
                try {
                    int zzb = zzb();
                    if (zzb == Integer.MAX_VALUE || zzacvVar.zzG()) {
                        break;
                    }
                    boolean z2 = false;
                    if (zzb == 1) {
                        obj2 = zzU((zzagm) zzahVar.f68zza, null, null);
                    } else if (zzb != 2) {
                        try {
                            if (!zzacvVar.zzG() && (i2 = this.leavesToSkip) != this.leavesSkipped) {
                                z = zzacvVar.zzc(i2);
                                if (z) {
                                    throw new zzaeh("Unable to parse map entry.");
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        } catch (zzaeg e) {
                            if (!zzacvVar.zzG() && (i = this.leavesToSkip) != this.leavesSkipped) {
                                z2 = zzacvVar.zzc(i);
                            }
                            throw new zzaeh("Unable to parse map entry.", e);
                        }
                    } else {
                        obj3 = zzU((zzagm) zzahVar.zzb, obj.getClass(), zzadfVar);
                    }
                } catch (Throwable th) {
                    zzacvVar.zzE(zzD);
                    throw th;
                }
            }
        }

        public void zzQ(int i) {
            if ((this.leavesToSkip & 7) == i) {
                return;
            }
            TransportImpl$$ExternalSyntheticLambda0.m();
        }

        public void zzz(zzbkb zzbkbVar) {
            int zza;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 1) {
                do {
                    zzbkbVar.add(Double.valueOf(zzbiqVar.zzd()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                this.size = zza;
                return;
            }
            if (i == 2) {
                int zzo = zzbiqVar.zzo();
                zzaa(zzo);
                int zzE = zzbiqVar.zzE() + zzo;
                do {
                    zzbkbVar.add(Double.valueOf(zzbiqVar.zzd()));
                } while (zzbiqVar.zzE() < zzE);
                return;
            }
            TransportImpl$$ExternalSyntheticLambda0.m$1();
        }

        public void zzC(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbkn;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbkn zzbknVar = (zzbkn) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbknVar.zzf(zzbiqVar.zzg());
                        } while (zzbiqVar.zzE() < zzE);
                        zzY(zzE);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbknVar.zzf(zzbiqVar.zzg());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbkbVar.add(Long.valueOf(zzbiqVar.zzg()));
                        } while (zzbiqVar.zzE() < zzE2);
                        zzY(zzE2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Long.valueOf(zzbiqVar.zzg()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzE(zzaef zzaefVar) {
            int zza;
            zzacv zzacvVar = (zzacv) this.stack;
            int i = this.leavesToSkip & 7;
            if (i == 0) {
                do {
                    zzaefVar.add(Boolean.valueOf(zzacvVar.zzk()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                this.size = zza;
                return;
            }
            if (i == 2) {
                int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                do {
                    zzaefVar.add(Boolean.valueOf(zzacvVar.zzk()));
                } while (zzacvVar.zzH() < zzH);
                zzV(zzH);
                return;
            }
            TransportImpl$$ExternalSyntheticLambda0.m();
        }

        public void zzM(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbjsVar.zzh(zzbiqVar.zzp());
                        } while (zzbiqVar.zzE() < zzE);
                        zzY(zzE);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzp());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbkbVar.add(Integer.valueOf(zzbiqVar.zzp()));
                        } while (zzbiqVar.zzE() < zzE2);
                        zzY(zzE2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzp()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzO(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzaeq;
            int i2 = this.leavesToSkip;
            if (z) {
                zzaeq zzaeqVar = (zzaeq) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                        do {
                            zzaeqVar.zzf(zzacvVar.zzu());
                        } while (zzacvVar.zzH() < zzH);
                        zzV(zzH);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzaeqVar.zzf(zzacvVar.zzu());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                        do {
                            zzaefVar.add(Long.valueOf(zzacvVar.zzu()));
                        } while (zzacvVar.zzH() < zzH2);
                        zzV(zzH2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzaefVar.add(Long.valueOf(zzacvVar.zzu()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzD(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbjsVar.zzh(zzbiqVar.zzh());
                        } while (zzbiqVar.zzE() < zzE);
                        zzY(zzE);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzh());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbkbVar.add(Integer.valueOf(zzbiqVar.zzh()));
                        } while (zzbiqVar.zzE() < zzE2);
                        zzY(zzE2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzh()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzF(zzaef zzaefVar, boolean z) {
            String zzl;
            int zza;
            zzacv zzacvVar = (zzacv) this.stack;
            if ((this.leavesToSkip & 7) != 2) {
                TransportImpl$$ExternalSyntheticLambda0.m();
                return;
            }
            do {
                if (z) {
                    zzQ(2);
                    zzl = zzacvVar.zzm();
                } else {
                    zzQ(2);
                    zzl = zzacvVar.zzl();
                }
                zzaefVar.add(zzl);
                if (zzacvVar.zzG()) {
                    return;
                } else {
                    zza = zzacvVar.zza();
                }
            } while (zza == this.leavesToSkip);
            this.size = zza;
        }

        public void zzL(zzbkb zzbkbVar) {
            int zza;
            int i;
            zzbiq zzbiqVar = (zzbiq) this.stack;
            boolean z = zzbkbVar instanceof zzbjs;
            int i2 = this.leavesToSkip;
            if (z) {
                zzbjs zzbjsVar = (zzbjs) zzbkbVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzE = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbjsVar.zzh(zzbiqVar.zzo());
                        } while (zzbiqVar.zzE() < zzE);
                        zzY(zzE);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbjsVar.zzh(zzbiqVar.zzo());
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        i = zzbiqVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzE2 = zzbiqVar.zzE() + zzbiqVar.zzo();
                        do {
                            zzbkbVar.add(Integer.valueOf(zzbiqVar.zzo()));
                        } while (zzbiqVar.zzE() < zzE2);
                        zzY(zzE2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m$1();
                    return;
                }
                do {
                    zzbkbVar.add(Integer.valueOf(zzbiqVar.zzo()));
                    if (zzbiqVar.zzD()) {
                        return;
                    } else {
                        zza = zzbiqVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public void zzN(zzaef zzaefVar) {
            int zza;
            int i;
            zzacv zzacvVar = (zzacv) this.stack;
            boolean z = zzaefVar instanceof zzadv;
            int i2 = this.leavesToSkip;
            if (z) {
                zzadv zzadvVar = (zzadv) zzaefVar;
                int i3 = i2 & 7;
                if (i3 != 0) {
                    if (i3 == 2) {
                        int zzH = zzacvVar.zzH() + zzacvVar.zzp();
                        do {
                            zzadvVar.zzh(zzacvVar.zzt());
                        } while (zzacvVar.zzH() < zzH);
                        zzV(zzH);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzadvVar.zzh(zzacvVar.zzt());
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        i = zzacvVar.zza();
                    }
                } while (i == this.leavesToSkip);
            } else {
                int i4 = i2 & 7;
                if (i4 != 0) {
                    if (i4 == 2) {
                        int zzH2 = zzacvVar.zzH() + zzacvVar.zzp();
                        do {
                            zzaefVar.add(Integer.valueOf(zzacvVar.zzt()));
                        } while (zzacvVar.zzH() < zzH2);
                        zzV(zzH2);
                        return;
                    }
                    TransportImpl$$ExternalSyntheticLambda0.m();
                    return;
                }
                do {
                    zzaefVar.add(Integer.valueOf(zzacvVar.zzt()));
                    if (zzacvVar.zzG()) {
                        return;
                    } else {
                        zza = zzacvVar.zza();
                    }
                } while (zza == this.leavesToSkip);
                i = zza;
            }
            this.size = i;
        }

        public static final void zzX(int i) {
            if ((i & 7) == 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$5("Failed to parse the message.");
        }
    }

    public final class Node implements Map.Entry {
        public final int hash;
        public int height;
        public final Object key;
        public Node left;
        public Node next;
        public Node parent;
        public Node prev;
        public Node right;
        public Object value;

        public Node(Node node, Object obj, int i, Node node2, Node node3) {
            this.parent = node;
            this.key = obj;
            this.hash = i;
            this.height = 1;
            this.next = node2;
            this.prev = node3;
            node3.next = this;
            node2.prev = this;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.key;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.value;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.key;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.value;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            Object obj2 = this.value;
            this.value = obj;
            return obj2;
        }

        public final String toString() {
            return this.key + "=" + this.value;
        }

        public Node() {
            this.key = null;
            this.hash = -1;
            this.prev = this;
            this.next = this;
        }
    }

    /* loaded from: classes5.dex */
    public abstract class LinkedTreeMapIterator implements Iterator {
        public int expectedModCount;
        public Map.Entry next;
        public final /* synthetic */ AbstractMap this$0;
        public final /* synthetic */ int $r8$classId = 1;
        public Map.Entry lastReturned = null;

        public LinkedTreeMapIterator(LinkedTreeMap linkedTreeMap) {
            this.this$0 = linkedTreeMap;
            this.next = linkedTreeMap.header.next;
            this.expectedModCount = linkedTreeMap.modCount;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.$r8$classId;
            AbstractMap abstractMap = this.this$0;
            switch (i) {
                case 0:
                    if (((Node) this.next) != ((LinkedHashTreeMap) abstractMap).header) {
                        break;
                    }
                    break;
                default:
                    if (((LinkedTreeMap.Node) this.next) != ((LinkedTreeMap) abstractMap).header) {
                        break;
                    }
                    break;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            switch (this.$r8$classId) {
                case 0:
                    return m3830nextNode();
                default:
                    return nextNode();
            }
        }

        public LinkedTreeMap.Node nextNode() {
            LinkedTreeMap.Node node = (LinkedTreeMap.Node) this.next;
            LinkedTreeMap linkedTreeMap = (LinkedTreeMap) this.this$0;
            if (node == linkedTreeMap.header) {
                a$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            if (linkedTreeMap.modCount != this.expectedModCount) {
                Drop$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            this.next = node.next;
            this.lastReturned = node;
            return node;
        }

        @Override // java.util.Iterator
        public final void remove() {
            int i = this.$r8$classId;
            AbstractMap abstractMap = this.this$0;
            switch (i) {
                case 0:
                    LinkedHashTreeMap linkedHashTreeMap = (LinkedHashTreeMap) abstractMap;
                    Node node = (Node) this.lastReturned;
                    if (node == null) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        linkedHashTreeMap.removeInternal(node, true);
                        this.lastReturned = null;
                        this.expectedModCount = linkedHashTreeMap.modCount;
                        break;
                    }
                default:
                    LinkedTreeMap linkedTreeMap = (LinkedTreeMap) abstractMap;
                    LinkedTreeMap.Node node2 = (LinkedTreeMap.Node) this.lastReturned;
                    if (node2 == null) {
                        Path$$ExternalSyntheticBUOutline0.m();
                        break;
                    } else {
                        linkedTreeMap.removeInternal(node2, true);
                        this.lastReturned = null;
                        this.expectedModCount = linkedTreeMap.modCount;
                        break;
                    }
            }
        }

        public LinkedTreeMapIterator(LinkedHashTreeMap linkedHashTreeMap) {
            this.this$0 = linkedHashTreeMap;
            this.next = linkedHashTreeMap.header.next;
            this.expectedModCount = linkedHashTreeMap.modCount;
        }

        /* renamed from: nextNode, reason: collision with other method in class */
        public Node m3830nextNode() {
            Node node = (Node) this.next;
            LinkedHashTreeMap linkedHashTreeMap = (LinkedHashTreeMap) this.this$0;
            if (node != linkedHashTreeMap.header) {
                if (linkedHashTreeMap.modCount == this.expectedModCount) {
                    this.next = node.next;
                    this.lastReturned = node;
                    return node;
                }
                Drop$$ExternalSyntheticBUOutline0.m$1();
                return null;
            }
            a$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }
}
