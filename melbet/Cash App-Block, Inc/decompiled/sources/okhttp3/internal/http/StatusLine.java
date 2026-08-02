package okhttp3.internal.http;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.compose.ui.spatial.RectListKt;
import androidx.core.content.res.CamUtils;
import androidx.core.content.res.ColorStateListInflaterCompat;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap$Builder$DuplicateKey;
import com.google.common.collect.RegularImmutableMap;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function4;
import okhttp3.Protocol;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class StatusLine {
    public final /* synthetic */ int $r8$classId;
    public int code;
    public Object message;
    public Object protocol;

    public StatusLine(int i) {
        this.$r8$classId = 4;
        this.protocol = new Object[i * 2];
        this.code = 0;
    }

    public static StatusLine createFromXml(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return new StatusLine(CamUtils.createFromXmlInner(resources, xml, asAttributeSet, theme), (ColorStateList) null, 0);
        }
        if (name.equals("selector")) {
            ColorStateList createFromXmlInner = ColorStateListInflaterCompat.createFromXmlInner(resources, xml, asAttributeSet, theme);
            return new StatusLine((Shader) null, createFromXmlInner, createFromXmlInner.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    public RegularImmutableMap build(boolean z) {
        ImmutableMap$Builder$DuplicateKey immutableMap$Builder$DuplicateKey;
        ImmutableMap$Builder$DuplicateKey immutableMap$Builder$DuplicateKey2;
        if (z && (immutableMap$Builder$DuplicateKey2 = (ImmutableMap$Builder$DuplicateKey) this.message) != null) {
            throw immutableMap$Builder$DuplicateKey2.exception();
        }
        RegularImmutableMap create = RegularImmutableMap.create(this.code, (Object[]) this.protocol, this);
        if (!z || (immutableMap$Builder$DuplicateKey = (ImmutableMap$Builder$DuplicateKey) this.message) == null) {
            return create;
        }
        throw immutableMap$Builder$DuplicateKey.exception();
    }

    public void insert(int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, int i7) {
        long[] jArr = (long[]) this.protocol;
        int i8 = this.code;
        int i9 = i8 + 3;
        this.code = i9;
        int length = jArr.length;
        if (length <= i9) {
            int max = Math.max(length * 2, i9);
            this.protocol = Arrays.copyOf(jArr, max);
            this.message = Arrays.copyOf((long[]) this.message, max);
        }
        long[] jArr2 = (long[]) this.protocol;
        jArr2[i8] = (i2 << 32) | (i3 & BodyPartID.bodyIdMax);
        jArr2[i8 + 1] = (i4 << 32) | (i5 & BodyPartID.bodyIdMax);
        int i10 = i6 & 33554431;
        jArr2[i8 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (Math.min(0, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) << 50) | (i10 << 25) | (i & 33554431);
        if (i6 < 0) {
            return;
        }
        for (int i11 = i7 != -1 ? i7 : i8 - 3; i11 >= 0; i11 -= 3) {
            int i12 = i11 + 2;
            long j = jArr2[i12];
            if ((((int) j) & 33554431) == i10) {
                jArr2[i12] = (Math.min((i8 - i11) / 3, IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) << 50) | (j & RectListKt.EverythingButLastChildOffset);
                return;
            }
        }
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        return ((Shader) this.protocol) == null && (colorStateList = (ColorStateList) this.message) != null && colorStateList.isStateful();
    }

    public void put(Object obj, Object obj2) {
        int i = (this.code + 1) * 2;
        Object[] objArr = (Object[]) this.protocol;
        if (i > objArr.length) {
            this.protocol = Arrays.copyOf(objArr, ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, i));
        }
        if (obj == null) {
            a$$ExternalSyntheticBUOutline0.m$2(Boxes$$ExternalSyntheticOutline1.m("null key in entry: null=", obj2));
        } else if (obj2 == null) {
            a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("null value in entry: ", "=null", obj));
        }
        Object[] objArr2 = (Object[]) this.protocol;
        int i2 = this.code;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.code = i2 + 1;
    }

    public void putAll(Set set) {
        if (set instanceof Collection) {
            int size = (set.size() + this.code) * 2;
            Object[] objArr = (Object[]) this.protocol;
            if (size > objArr.length) {
                this.protocol = Arrays.copyOf(objArr, ImmutableCollection.ArrayBasedBuilder.expandedCapacity(objArr.length, size));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            put(entry.getKey(), entry.getValue());
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.protocol) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.code);
                sb.append(' ');
                sb.append((String) this.message);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void updateHasCallbacks(int i, boolean z) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.protocol;
        int i3 = this.code;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            int i5 = i4 + 2;
            long j = jArr[i5];
            if ((((int) j) & 33554431) == i2) {
                long j2 = 8070450532247928831L & j;
                long j3 = z ? 1L : 0L;
                jArr[i5] = j2 | (1152921504606846976L * j3) | (j3 * Long.MIN_VALUE);
                return;
            }
        }
    }

    public void updateSubhierarchy(int i, int i2, long j) {
        int i3;
        char c;
        char c2;
        long[] jArr = (long[]) this.protocol;
        long[] jArr2 = (long[]) this.message;
        jArr2[0] = j;
        int i4 = 1;
        while (i4 > 0) {
            i4--;
            long j2 = jArr2[i4];
            int i5 = 33554431;
            int i6 = ((int) j2) & 33554431;
            char c3 = 25;
            int i7 = ((int) (j2 >> 25)) & 33554431;
            char c4 = '2';
            int i8 = ((int) (j2 >> 50)) & IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2;
            int i9 = i8 == 1023 ? this.code : (i8 * 3) + i7;
            if (i7 < 0) {
                return;
            }
            while (i7 < jArr.length - 2 && i7 < i9) {
                int i10 = i7 + 2;
                long j3 = jArr[i10];
                if ((((int) (j3 >> c3)) & i5) == i6) {
                    long j4 = jArr[i7];
                    int i11 = i7 + 1;
                    i3 = i5;
                    c = c3;
                    long j5 = jArr[i11];
                    c2 = c4;
                    jArr[i7] = ((((int) j4) + i2) & BodyPartID.bodyIdMax) | ((((int) (j4 >> 32)) + i) << 32);
                    jArr[i11] = ((((int) j5) + i2) & BodyPartID.bodyIdMax) | ((((int) (j5 >> 32)) + i) << 32);
                    jArr[i10] = (((j3 >> 63) & 1) << 60) | j3;
                    if ((((int) (j3 >> c2)) & IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG2) > 0) {
                        jArr2[i4] = (RectListKt.EverythingButParentId & j3) | (((i7 + 3) & i3) << c);
                        i4++;
                    }
                } else {
                    i3 = i5;
                    c = c3;
                    c2 = c4;
                }
                i7 += 3;
                i5 = i3;
                c3 = c;
                c4 = c2;
            }
        }
    }

    public void withRect(int i, Function4 function4) {
        int i2 = i & 33554431;
        long[] jArr = (long[]) this.protocol;
        int i3 = this.code;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 33554431) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                function4.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        this.$r8$classId = 0;
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public StatusLine(Shader shader, ColorStateList colorStateList, int i) {
        this.$r8$classId = 3;
        this.protocol = shader;
        this.message = colorStateList;
        this.code = i;
    }

    public /* synthetic */ StatusLine(byte b, int i) {
        this.$r8$classId = i;
    }
}
