package okhttp3.internal.http2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import androidx.compose.animation.core.AnimationVector;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.FloatTweenSpec;
import androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec;
import androidx.datastore.core.SimpleActor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.wrappers.Wrappers;
import com.plaid.internal.EnumC0170g;
import com.squareup.contour.constraints.SizeConfigSmartLambdas$matchParent$1;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
public abstract class Huffman {
    public static final int[] CODES = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS, IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_TRANSFER_FUNCS, 4090, 8185, 21, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 2042, IptcConstants.IMAGE_RESOURCE_BLOCK_DUOTONE_IMAGE_INFO, IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTIVE_BW, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, 2043, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 32764, 32, 4091, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG1, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 115, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, EnumC0170g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, TiffTagConstants.COMPRESSION_VALUE_NEXT, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
    public static final byte[] CODE_BIT_COUNTS = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
    public static final Node root = new Node(0);

    static {
        Node[] nodeArr;
        for (int i = 0; i < 256; i++) {
            int i2 = CODES[i];
            int i3 = CODE_BIT_COUNTS[i];
            Node node = new Node();
            node.children = null;
            node.symbol = i;
            int i4 = i3 & 7;
            if (i4 == 0) {
                i4 = 8;
            }
            node.terminalBitCount = i4;
            Node node2 = root;
            while (true) {
                nodeArr = (Node[]) node2.children;
                if (i3 > 8) {
                    i3 -= 8;
                    int i5 = (i2 >>> i3) & 255;
                    nodeArr.getClass();
                    Node node3 = nodeArr[i5];
                    if (node3 == null) {
                        node3 = new Node(0);
                        nodeArr[i5] = node3;
                    }
                    node2 = node3;
                }
            }
            int i6 = 8 - i3;
            int i7 = (i2 << i6) & 255;
            nodeArr.getClass();
            Arrays.fill(nodeArr, i7, (1 << i6) + i7, node);
        }
    }

    public final class Node implements VectorizedDurationBasedAnimationSpec {
        public Object children;
        public int symbol;
        public int terminalBitCount;

        public Node(int i) {
            switch (i) {
                case 3:
                    this.symbol = PKIFailureInfo.systemUnavail;
                    this.terminalBitCount = PKIFailureInfo.systemUnavail;
                    this.children = SizeConfigSmartLambdas$matchParent$1.INSTANCE;
                    break;
                default:
                    this.children = new Node[256];
                    this.symbol = 0;
                    this.terminalBitCount = 0;
                    break;
            }
        }

        @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
        public int getDelayMillis() {
            return this.terminalBitCount;
        }

        @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
        public int getDurationMillis() {
            return this.symbol;
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public AnimationVector getValueFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.children).getValueFromNanos(j, animationVector, animationVector2, animationVector3);
        }

        @Override // androidx.compose.animation.core.VectorizedAnimationSpec
        public AnimationVector getVelocityFromNanos(long j, AnimationVector animationVector, AnimationVector animationVector2, AnimationVector animationVector3) {
            return ((SimpleActor) this.children).getVelocityFromNanos(j, animationVector, animationVector2, animationVector3);
        }

        public int resolve() {
            if (this.terminalBitCount == Integer.MIN_VALUE) {
                int i = this.symbol;
                if (i == Integer.MIN_VALUE) {
                    a$$ExternalSyntheticBUOutline0.m$3("Triggering layout before parent geometry available");
                    return 0;
                }
                this.terminalBitCount = ((Number) ((Function1) this.children).invoke(Integer.valueOf(i))).intValue();
            }
            return this.terminalBitCount;
        }

        public synchronized int zza() {
            PackageInfo packageInfo;
            if (this.symbol == 0) {
                try {
                    packageInfo = Wrappers.packageManager((Context) this.children).getPackageInfo(0, "com.google.android.gms");
                } catch (PackageManager.NameNotFoundException e) {
                    Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.symbol = packageInfo.versionCode;
                }
            }
            return this.symbol;
        }

        public synchronized int zzb() {
            int i = this.terminalBitCount;
            if (i != 0) {
                return i;
            }
            Context context = (Context) this.children;
            PackageManager packageManager = context.getPackageManager();
            if (Wrappers.packageManager(context).ctx.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                this.terminalBitCount = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            this.terminalBitCount = 2;
            return 2;
        }

        public Node(int i, int i2, Easing easing) {
            this.symbol = i;
            this.terminalBitCount = i2;
            this.children = new SimpleActor(new FloatTweenSpec(i, i2, easing));
        }
    }
}
