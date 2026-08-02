package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abf {
    public static float a(EdgeEffect edgeEffect) {
        float distance;
        try {
            distance = edgeEffect.getDistance();
            return distance;
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static float b(EdgeEffect edgeEffect, float f, float f2) {
        float onPullDistance;
        try {
            onPullDistance = edgeEffect.onPullDistance(f, f2);
            return onPullDistance;
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static EdgeEffect c(Context context, AttributeSet attributeSet) {
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static final xc d(View view, xc xcVar) {
        CharSequence coerceToStyledText;
        xa xaVar = xcVar.a;
        if (xaVar.b() == 2) {
            return xcVar;
        }
        ClipData c = xaVar.c();
        int a = xaVar.a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < c.getItemCount(); i++) {
            ClipData.Item itemAt = c.getItemAt(i);
            if ((a & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                }
                z = true;
            }
        }
        return null;
    }

    public static final Object e(ajw ajwVar, boolean z, boolean z2, krt krtVar) {
        ajwVar.l();
        if (ajwVar.q() && !ajwVar.r()) {
            kqn kqnVar = (kqn) ajwVar.f.get();
            if ((kqnVar != null ? (ake) kqnVar.get(ake.b) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        kqn kqnVar2 = (kqn) ajwVar.f.get();
        if (kqnVar2 == null) {
            kqnVar2 = kqo.a;
        }
        return zy.f(new alq(kqnVar2, ajwVar, z2, z, krtVar, null));
    }

    public static final Object f(ajw ajwVar, kqj kqjVar) {
        ake akeVar = (ake) kqjVar.bU().get(ake.b);
        kqn kqnVar = akeVar != null ? akeVar.a : null;
        if (ajwVar.q()) {
            return kqnVar != null ? ajwVar.k().plus(kqnVar) : ajwVar.k();
        }
        kqn k = ajwVar.k();
        if (kqnVar == null) {
            kqnVar = kqo.a;
        }
        return k.plus(kqnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(ajw ajwVar, boolean z, krt krtVar, kqj kqjVar) {
        als alsVar;
        int i;
        boolean z2;
        ajw ajwVar2;
        krt krtVar2;
        if (kqjVar instanceof als) {
            alsVar = (als) kqjVar;
            int i2 = alsVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                alsVar.d = i2 - Integer.MIN_VALUE;
                Object obj = alsVar.c;
                Object obj2 = kqp.a;
                i = alsVar.d;
                if (i != 0) {
                    ixc.Y(obj);
                    if (ajwVar.q() && ajwVar.s() && ajwVar.r()) {
                        krx ehpVar = new ehp(z, ajwVar, (kqj) null, krtVar, 1);
                        alsVar.d = 1;
                        Object v = ajwVar.v(ehpVar, alsVar);
                        if (v != obj2) {
                            return v;
                        }
                    } else {
                        alsVar.e = (WorkDatabase_Impl) ajwVar;
                        alsVar.f = (ajq) krtVar;
                        alsVar.a = z;
                        alsVar.b = false;
                        alsVar.d = 2;
                        obj = f(ajwVar, alsVar);
                        if (obj != obj2) {
                            z2 = z;
                            ajwVar2 = ajwVar;
                            krtVar2 = krtVar;
                        }
                    }
                }
                if (i == 1) {
                    ixc.Y(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                    return obj;
                }
                boolean z3 = alsVar.b;
                z2 = alsVar.a;
                krtVar2 = alsVar.f;
                ajwVar2 = alsVar.e;
                ixc.Y(obj);
                alr alrVar = new alr(null, ajwVar2, z2, krtVar2);
                alsVar.e = null;
                alsVar.f = null;
                alsVar.d = 3;
                Object f = ixg.f((kqn) obj, alrVar, alsVar);
                return f != obj2 ? obj2 : f;
            }
        }
        alsVar = new als(kqjVar);
        Object obj3 = alsVar.c;
        Object obj22 = kqp.a;
        i = alsVar.d;
        if (i != 0) {
        }
        alr alrVar2 = new alr(null, ajwVar2, z2, krtVar2);
        alsVar.e = null;
        alsVar.f = null;
        alsVar.d = 3;
        Object f2 = ixg.f((kqn) obj3, alrVar2, alsVar);
        if (f2 != obj22) {
        }
    }

    public static final void h(ana anaVar) {
        kpt kptVar = new kpt(10);
        amh a = anaVar.a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (a.l()) {
            try {
                kptVar.add(a.d(0));
            } finally {
            }
        }
        ixf.i(a, null);
        ListIterator listIterator = ((kpt) ixc.a(kptVar)).listIterator(0);
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (ksp.s(str, "room_fts_content_sync_")) {
                yj.o(anaVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }

    public static final int i(art artVar) {
        artVar.getClass();
        int ordinal = artVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new koj();
    }

    public static final int j(atb atbVar) {
        atbVar.getClass();
        int ordinal = atbVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        throw new koj();
                    }
                }
            }
        }
        return i;
    }

    public static final art k(int i) {
        if (i == 0) {
            return art.a;
        }
        if (i == 1) {
            return art.b;
        }
        throw new IllegalArgumentException(a.ai(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final atb l(int i) {
        if (i == 0) {
            return atb.a;
        }
        if (i == 1) {
            return atb.b;
        }
        if (i == 2) {
            return atb.c;
        }
        if (i == 3) {
            return atb.d;
        }
        if (i == 4) {
            return atb.e;
        }
        if (i == 5) {
            return atb.f;
        }
        throw new IllegalArgumentException(a.ai(i, "Could not convert ", " to State"));
    }

    public static final ayk m(byte[] bArr) {
        if (bArr.length == 0) {
            return new ayk(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                for (int i3 = 0; i3 < readInt2; i3++) {
                    int i4 = iArr2[i3];
                    try {
                        builder.addCapability(i4);
                    } catch (IllegalArgumentException e) {
                        asq.a().f(ayk.a, a.ai(i4, "Ignoring adding capability '", "'"), e);
                    }
                }
                int[] iArr3 = ayl.a;
                for (int i5 = 0; i5 < 3; i5++) {
                    int i6 = iArr3[i5];
                    int i7 = 0;
                    while (true) {
                        if (i7 < readInt2) {
                            if (i6 != iArr2[i7]) {
                                i7++;
                            } else if (i7 >= 0) {
                            }
                        }
                    }
                    try {
                        builder.removeCapability(i6);
                        break;
                    } catch (IllegalArgumentException e2) {
                        asq.a().f(ayk.a, a.ai(i6, "Ignoring removing default capability '", "'"), e2);
                    }
                }
                for (int i8 = 0; i8 < readInt; i8++) {
                    builder.addTransportType(iArr[i8]);
                }
                NetworkRequest build = builder.build();
                build.getClass();
                ayk aykVar = new ayk(build);
                ixf.j(objectInputStream, null);
                ixf.j(byteArrayInputStream, null);
                return aykVar;
            } finally {
            }
        } finally {
        }
    }

    public static final Set n(byte[] bArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new arx(parse, readBoolean));
                    }
                    ixf.j(objectInputStream, null);
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ixf.j(byteArrayInputStream, null);
        return linkedHashSet;
    }

    public static final byte[] o(ayk aykVar) {
        int[] u;
        boolean hasTransport;
        int[] u2;
        boolean hasCapability;
        Object obj = aykVar.b;
        if (obj == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] iArr = ayl.a;
                if (Build.VERSION.SDK_INT >= 31) {
                    u = ((NetworkRequest) obj).getTransportTypes();
                    u.getClass();
                } else {
                    int[] iArr2 = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < 10; i++) {
                        int i2 = iArr2[i];
                        hasTransport = ((NetworkRequest) obj).hasTransport(i2);
                        if (hasTransport) {
                            arrayList.add(Integer.valueOf(i2));
                        }
                    }
                    u = ixc.u(arrayList);
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    u2 = ((NetworkRequest) obj).getCapabilities();
                    u2.getClass();
                } else {
                    int[] iArr3 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < 30; i3++) {
                        int i4 = iArr3[i3];
                        hasCapability = ((NetworkRequest) obj).hasCapability(i4);
                        if (hasCapability) {
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    u2 = ixc.u(arrayList2);
                }
                objectOutputStream.writeInt(u.length);
                for (int i5 : u) {
                    objectOutputStream.writeInt(i5);
                }
                objectOutputStream.writeInt(u2.length);
                for (int i6 : u2) {
                    objectOutputStream.writeInt(i6);
                }
                ixf.j(objectOutputStream, null);
                ixf.j(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final byte[] p(Set set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arx arxVar = (arx) it.next();
                    objectOutputStream.writeUTF(arxVar.a.toString());
                    objectOutputStream.writeBoolean(arxVar.b);
                }
                ixf.j(objectOutputStream, null);
                ixf.j(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    public static final int q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                i3 = 3;
                if (i2 != 3) {
                    i3 = 4;
                    if (i2 != 4) {
                        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
                            return 5;
                        }
                        throw new IllegalArgumentException("Could not convert " + ((Object) yo.e(i)) + " to int");
                    }
                }
            }
        }
        return i3;
    }

    public static final int r(int i) {
        if (i != 0) {
            return i + (-1) != 0 ? 1 : 0;
        }
        throw null;
    }

    public static final int s(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(a.ai(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final int t(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(a.ai(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final axl u(axt axtVar) {
        axtVar.getClass();
        return new axl(axtVar.b, axtVar.t);
    }

    public static /* synthetic */ int v(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final List w(awx awxVar, String str) {
        awxVar.getClass();
        str.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List q = ixc.q(awxVar.a(str));
        while (!q.isEmpty()) {
            String str2 = (String) ixc.e(q);
            linkedHashSet.add(str2);
            q.addAll(awxVar.a(str2));
        }
        return ixc.p(linkedHashSet);
    }
}
