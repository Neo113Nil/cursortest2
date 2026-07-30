package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.drawable.IconCompat;
import com.ice.fishing.grenza.R;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m9 implements g82, r9 {
    public static final Object cpQdD2nAriOS = new Object();
    public static volatile m9 x50lh2ztY7Y5;
    public Object OPXfSBeufaJ8;
    public Object dgRBjINgWbAK;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public Object wdg6QnbFHrFF;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02d1  */
    /* JADX WARN: Type inference failed for: r18v2, types: [android.graphics.Bitmap, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m9(ge1 ge1Var) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Notification notification;
        ArrayList arrayList6;
        int i2;
        char c;
        Icon icon;
        int i3;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        int i4;
        this.rtx2ld2ELZv4 = 15;
        this.dgRBjINgWbAK = new Bundle();
        this.wdg6QnbFHrFF = ge1Var;
        Context context = ge1Var.PxuCJdSBwIXG;
        ArrayList arrayList7 = ge1Var.gPXPFXrUH4XX;
        ArrayList arrayList8 = ge1Var.TSizfFm2Yiuu;
        ArrayList arrayList9 = ge1Var.Y1f8riQaR6yg;
        if (Build.VERSION.SDK_INT >= 26) {
            this.OPXfSBeufaJ8 = vl.lS5Rgt96tfkO(context, ge1Var.cpQdD2nAriOS);
        } else {
            this.OPXfSBeufaJ8 = new Notification.Builder(context);
        }
        Notification notification2 = ge1Var.QrzZRwfaDlRX;
        Object obj = null;
        int i5 = 0;
        ((Notification.Builder) this.OPXfSBeufaJ8).setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(ge1Var.e9gEMXR7LXtO).setContentText(ge1Var.a92UlCVFR9N8).setContentInfo(null).setContentIntent(ge1Var.RAsUl2FVSrh6).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        ((Notification.Builder) this.OPXfSBeufaJ8).setLargeIcon((Icon) null);
        ((Notification.Builder) this.OPXfSBeufaJ8).setSubText(null).setUsesChronometer(false).setPriority(ge1Var.rtx2ld2ELZv4);
        ArrayList arrayList10 = ge1Var.lS5Rgt96tfkO;
        int size = arrayList10.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = i6 + 1;
            fe1 fe1Var = (fe1) arrayList10.get(i6);
            if (fe1Var.lS5Rgt96tfkO == null && (i4 = fe1Var.e9gEMXR7LXtO) != 0) {
                fe1Var.lS5Rgt96tfkO = IconCompat.PxuCJdSBwIXG(i4);
            }
            int i8 = i5;
            IconCompat iconCompat = fe1Var.lS5Rgt96tfkO;
            boolean z = fe1Var.TSizfFm2Yiuu;
            Bundle bundle = fe1Var.PxuCJdSBwIXG;
            ?? r18 = obj;
            if (iconCompat != null) {
                int i9 = iconCompat.PxuCJdSBwIXG;
                switch (i9) {
                    case -1:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        c = 2;
                        icon = (Icon) iconCompat.lS5Rgt96tfkO;
                        break;
                    case 0:
                    default:
                        u9.XL4ISE6Oc65B("Unknown type");
                        throw r18;
                    case 1:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        c = 2;
                        icon = Icon.createWithBitmap((Bitmap) iconCompat.lS5Rgt96tfkO);
                        colorStateList = iconCompat.RAsUl2FVSrh6;
                        if (colorStateList != null) {
                            icon.setTintList(colorStateList);
                        }
                        mode = iconCompat.rtx2ld2ELZv4;
                        if (mode != IconCompat.dgRBjINgWbAK) {
                            icon.setTintMode(mode);
                            break;
                        }
                        break;
                    case 2:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        if (i9 == -1) {
                            Object obj2 = iconCompat.lS5Rgt96tfkO;
                            if (Build.VERSION.SDK_INT >= 28) {
                                str = k00.Y1f8riQaR6yg(obj2);
                            } else {
                                try {
                                    str = (String) obj2.getClass().getMethod("getResPackage", null).invoke(obj2, null);
                                } catch (IllegalAccessException e) {
                                    Log.e("IconCompat", "Unable to get icon package", e);
                                    str = null;
                                    c = 2;
                                    icon = Icon.createWithResource(str, iconCompat.e9gEMXR7LXtO);
                                    colorStateList = iconCompat.RAsUl2FVSrh6;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.rtx2ld2ELZv4;
                                    if (mode != IconCompat.dgRBjINgWbAK) {
                                    }
                                    Notification.Action.Builder builder = new Notification.Action.Builder(icon, fe1Var.a92UlCVFR9N8, fe1Var.RAsUl2FVSrh6);
                                    if (bundle == null) {
                                    }
                                    r0.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder.setAllowGeneratedReplies(z);
                                    r0.putInt("android.support.action.semanticAction", i8);
                                    i3 = Build.VERSION.SDK_INT;
                                    if (i3 >= 28) {
                                    }
                                    if (i3 >= 29) {
                                    }
                                    if (i3 >= 31) {
                                    }
                                    if (i3 < 37) {
                                    }
                                    r0.putBoolean("android.support.action.showsUserInterface", fe1Var.Y1f8riQaR6yg);
                                    builder.addExtras(r0);
                                    ((Notification.Builder) this.OPXfSBeufaJ8).addAction(builder.build());
                                    i6 = i7;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i2;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    obj = null;
                                    i5 = 0;
                                } catch (NoSuchMethodException e2) {
                                    Log.e("IconCompat", "Unable to get icon package", e2);
                                    str = null;
                                    c = 2;
                                    icon = Icon.createWithResource(str, iconCompat.e9gEMXR7LXtO);
                                    colorStateList = iconCompat.RAsUl2FVSrh6;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.rtx2ld2ELZv4;
                                    if (mode != IconCompat.dgRBjINgWbAK) {
                                    }
                                    Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, fe1Var.a92UlCVFR9N8, fe1Var.RAsUl2FVSrh6);
                                    if (bundle == null) {
                                    }
                                    r0.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder2.setAllowGeneratedReplies(z);
                                    r0.putInt("android.support.action.semanticAction", i8);
                                    i3 = Build.VERSION.SDK_INT;
                                    if (i3 >= 28) {
                                    }
                                    if (i3 >= 29) {
                                    }
                                    if (i3 >= 31) {
                                    }
                                    if (i3 < 37) {
                                    }
                                    r0.putBoolean("android.support.action.showsUserInterface", fe1Var.Y1f8riQaR6yg);
                                    builder2.addExtras(r0);
                                    ((Notification.Builder) this.OPXfSBeufaJ8).addAction(builder2.build());
                                    i6 = i7;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i2;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    obj = null;
                                    i5 = 0;
                                } catch (InvocationTargetException e3) {
                                    Log.e("IconCompat", "Unable to get icon package", e3);
                                    str = null;
                                    c = 2;
                                    icon = Icon.createWithResource(str, iconCompat.e9gEMXR7LXtO);
                                    colorStateList = iconCompat.RAsUl2FVSrh6;
                                    if (colorStateList != null) {
                                    }
                                    mode = iconCompat.rtx2ld2ELZv4;
                                    if (mode != IconCompat.dgRBjINgWbAK) {
                                    }
                                    Notification.Action.Builder builder22 = new Notification.Action.Builder(icon, fe1Var.a92UlCVFR9N8, fe1Var.RAsUl2FVSrh6);
                                    if (bundle == null) {
                                    }
                                    r0.putBoolean("android.support.allowGeneratedReplies", z);
                                    builder22.setAllowGeneratedReplies(z);
                                    r0.putInt("android.support.action.semanticAction", i8);
                                    i3 = Build.VERSION.SDK_INT;
                                    if (i3 >= 28) {
                                    }
                                    if (i3 >= 29) {
                                    }
                                    if (i3 >= 31) {
                                    }
                                    if (i3 < 37) {
                                    }
                                    r0.putBoolean("android.support.action.showsUserInterface", fe1Var.Y1f8riQaR6yg);
                                    builder22.addExtras(r0);
                                    ((Notification.Builder) this.OPXfSBeufaJ8).addAction(builder22.build());
                                    i6 = i7;
                                    arrayList8 = arrayList4;
                                    arrayList10 = arrayList6;
                                    size = i2;
                                    arrayList9 = arrayList5;
                                    arrayList7 = arrayList3;
                                    notification2 = notification;
                                    obj = null;
                                    i5 = 0;
                                }
                            }
                            c = 2;
                        } else {
                            c = 2;
                            if (i9 != 2) {
                                u9.EcgxDIVH5in8(iconCompat, "called getResPackage() on ");
                                throw null;
                            }
                            String str2 = iconCompat.wdg6QnbFHrFF;
                            str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) iconCompat.lS5Rgt96tfkO).split(":", -1)[i8] : iconCompat.wdg6QnbFHrFF;
                        }
                        icon = Icon.createWithResource(str, iconCompat.e9gEMXR7LXtO);
                        colorStateList = iconCompat.RAsUl2FVSrh6;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.rtx2ld2ELZv4;
                        if (mode != IconCompat.dgRBjINgWbAK) {
                        }
                        break;
                    case 3:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        icon = Icon.createWithData((byte[]) iconCompat.lS5Rgt96tfkO, iconCompat.e9gEMXR7LXtO, iconCompat.a92UlCVFR9N8);
                        c = 2;
                        colorStateList = iconCompat.RAsUl2FVSrh6;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.rtx2ld2ELZv4;
                        if (mode != IconCompat.dgRBjINgWbAK) {
                        }
                        break;
                    case 4:
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        icon = Icon.createWithContentUri((String) iconCompat.lS5Rgt96tfkO);
                        c = 2;
                        colorStateList = iconCompat.RAsUl2FVSrh6;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.rtx2ld2ELZv4;
                        if (mode != IconCompat.dgRBjINgWbAK) {
                        }
                        break;
                    case 5:
                        int i10 = Build.VERSION.SDK_INT;
                        Object obj3 = iconCompat.lS5Rgt96tfkO;
                        arrayList4 = arrayList8;
                        if (i10 >= 26) {
                            icon = vl.TSizfFm2Yiuu((Bitmap) obj3);
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList9;
                            notification = notification2;
                            arrayList6 = arrayList10;
                            i2 = size;
                            c = 2;
                            colorStateList = iconCompat.RAsUl2FVSrh6;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.rtx2ld2ELZv4;
                            if (mode != IconCompat.dgRBjINgWbAK) {
                            }
                        } else {
                            int min = (int) (Math.min(r7.getWidth(), r7.getHeight()) * 0.6666667f);
                            Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                            arrayList6 = arrayList10;
                            Canvas canvas = new Canvas(createBitmap);
                            i2 = size;
                            Paint paint = new Paint(3);
                            float f = min * 0.5f;
                            arrayList5 = arrayList9;
                            paint.setColor(-16777216);
                            arrayList3 = arrayList7;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            BitmapShader bitmapShader = new BitmapShader((Bitmap) obj3, tileMode, tileMode);
                            Matrix matrix = new Matrix();
                            notification = notification2;
                            matrix.setTranslate((-(r7.getWidth() - min)) / 2.0f, (-(r7.getHeight() - min)) / 2.0f);
                            bitmapShader.setLocalMatrix(matrix);
                            paint.setShader(bitmapShader);
                            canvas.drawCircle(f, f, f * 0.9166667f, paint);
                            canvas.setBitmap(r18);
                            icon = Icon.createWithBitmap(createBitmap);
                            c = 2;
                            colorStateList = iconCompat.RAsUl2FVSrh6;
                            if (colorStateList != null) {
                            }
                            mode = iconCompat.rtx2ld2ELZv4;
                            if (mode != IconCompat.dgRBjINgWbAK) {
                            }
                        }
                        break;
                    case 6:
                        if (Build.VERSION.SDK_INT < 30) {
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.TSizfFm2Yiuu());
                        }
                        icon = hnJvRxDXo0hm.PxuCJdSBwIXG(iconCompat.TSizfFm2Yiuu());
                        arrayList3 = arrayList7;
                        arrayList4 = arrayList8;
                        arrayList5 = arrayList9;
                        notification = notification2;
                        arrayList6 = arrayList10;
                        i2 = size;
                        c = 2;
                        colorStateList = iconCompat.RAsUl2FVSrh6;
                        if (colorStateList != null) {
                        }
                        mode = iconCompat.rtx2ld2ELZv4;
                        if (mode != IconCompat.dgRBjINgWbAK) {
                        }
                        break;
                }
            } else {
                arrayList3 = arrayList7;
                arrayList4 = arrayList8;
                arrayList5 = arrayList9;
                notification = notification2;
                arrayList6 = arrayList10;
                i2 = size;
                c = 2;
                icon = null;
            }
            Notification.Action.Builder builder222 = new Notification.Action.Builder(icon, fe1Var.a92UlCVFR9N8, fe1Var.RAsUl2FVSrh6);
            Bundle bundle2 = bundle == null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder222.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", i8);
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                k00.dgRBjINgWbAK(builder222);
            }
            if (i3 >= 29) {
                yr.x50lh2ztY7Y5(builder222);
            }
            if (i3 >= 31) {
                d9.e9gEMXR7LXtO(builder222);
            }
            if (i3 < 37) {
                he1.PxuCJdSBwIXG(builder222);
                he1.lS5Rgt96tfkO(builder222);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", fe1Var.Y1f8riQaR6yg);
            builder222.addExtras(bundle2);
            ((Notification.Builder) this.OPXfSBeufaJ8).addAction(builder222.build());
            i6 = i7;
            arrayList8 = arrayList4;
            arrayList10 = arrayList6;
            size = i2;
            arrayList9 = arrayList5;
            arrayList7 = arrayList3;
            notification2 = notification;
            obj = null;
            i5 = 0;
        }
        ArrayList arrayList11 = arrayList7;
        ArrayList arrayList12 = arrayList8;
        ArrayList arrayList13 = arrayList9;
        Notification notification3 = notification2;
        Bundle bundle3 = ge1Var.x50lh2ztY7Y5;
        if (bundle3 != null) {
            ((Bundle) this.dgRBjINgWbAK).putAll(bundle3);
        }
        ((Notification.Builder) this.OPXfSBeufaJ8).setShowWhen(ge1Var.OPXfSBeufaJ8);
        ((Notification.Builder) this.OPXfSBeufaJ8).setLocalOnly(ge1Var.dgRBjINgWbAK);
        ((Notification.Builder) this.OPXfSBeufaJ8).setGroup(null);
        ((Notification.Builder) this.OPXfSBeufaJ8).setSortKey(null);
        ((Notification.Builder) this.OPXfSBeufaJ8).setGroupSummary(false);
        ((Notification.Builder) this.OPXfSBeufaJ8).setCategory(null);
        ((Notification.Builder) this.OPXfSBeufaJ8).setColor(0);
        ((Notification.Builder) this.OPXfSBeufaJ8).setVisibility(0);
        ((Notification.Builder) this.OPXfSBeufaJ8).setPublicVersion(null);
        ((Notification.Builder) this.OPXfSBeufaJ8).setSound(notification3.sound, notification3.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList12 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList12.size());
                Iterator it = arrayList12.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    u9.VhhvGxCb8gfr();
                    throw null;
                }
            }
            if (arrayList2 == null) {
                arrayList = arrayList11;
            } else {
                if (arrayList11 != null) {
                    ma maVar = new ma(arrayList11.size() + arrayList2.size());
                    maVar.addAll(arrayList2);
                    maVar.addAll(arrayList11);
                    arrayList2 = new ArrayList(maVar);
                }
                arrayList = arrayList2;
            }
        } else {
            arrayList = arrayList11;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj4 = arrayList.get(i11);
                i11++;
                ((Notification.Builder) this.OPXfSBeufaJ8).addPerson((String) obj4);
            }
        }
        if (arrayList13.size() > 0) {
            if (ge1Var.x50lh2ztY7Y5 == null) {
                ge1Var.x50lh2ztY7Y5 = new Bundle();
            }
            Bundle bundle4 = ge1Var.x50lh2ztY7Y5.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i12 = 0;
            while (i12 < arrayList13.size()) {
                String num = Integer.toString(i12);
                ArrayList arrayList14 = arrayList13;
                fe1 fe1Var2 = (fe1) arrayList14.get(i12);
                Bundle bundle7 = new Bundle();
                if (fe1Var2.lS5Rgt96tfkO == null && (i = fe1Var2.e9gEMXR7LXtO) != 0) {
                    fe1Var2.lS5Rgt96tfkO = IconCompat.PxuCJdSBwIXG(i);
                }
                IconCompat iconCompat2 = fe1Var2.lS5Rgt96tfkO;
                Bundle bundle8 = fe1Var2.PxuCJdSBwIXG;
                bundle7.putInt("icon", iconCompat2 != null ? iconCompat2.lS5Rgt96tfkO() : 0);
                bundle7.putCharSequence("title", fe1Var2.a92UlCVFR9N8);
                bundle7.putParcelable("actionIntent", fe1Var2.RAsUl2FVSrh6);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", fe1Var2.TSizfFm2Yiuu);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", fe1Var2.Y1f8riQaR6yg);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i12++;
                arrayList13 = arrayList14;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (ge1Var.x50lh2ztY7Y5 == null) {
                ge1Var.x50lh2ztY7Y5 = new Bundle();
            }
            ge1Var.x50lh2ztY7Y5.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.dgRBjINgWbAK).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.OPXfSBeufaJ8).setExtras(ge1Var.x50lh2ztY7Y5);
        ((Notification.Builder) this.OPXfSBeufaJ8).setRemoteInputHistory(null);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            vl.OPXfSBeufaJ8((Notification.Builder) this.OPXfSBeufaJ8);
            vl.dgRBjINgWbAK((Notification.Builder) this.OPXfSBeufaJ8);
            vl.x50lh2ztY7Y5((Notification.Builder) this.OPXfSBeufaJ8);
            vl.cpQdD2nAriOS((Notification.Builder) this.OPXfSBeufaJ8);
            vl.wdg6QnbFHrFF((Notification.Builder) this.OPXfSBeufaJ8);
            if (!TextUtils.isEmpty(ge1Var.cpQdD2nAriOS)) {
                ((Notification.Builder) this.OPXfSBeufaJ8).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i13 >= 28) {
            Iterator it2 = arrayList12.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                u9.VhhvGxCb8gfr();
                throw null;
            }
        }
        if (i13 >= 29) {
            yr.wdg6QnbFHrFF((Notification.Builder) this.OPXfSBeufaJ8, ge1Var.r3s1LDPKFs1S);
            yr.dgRBjINgWbAK((Notification.Builder) this.OPXfSBeufaJ8);
        }
        if (i13 >= 36) {
            GlTbNTgfSMqy.a92UlCVFR9N8((Notification.Builder) this.OPXfSBeufaJ8);
        }
    }

    public static m9 S9EYkSpbGuxq(Context context) {
        if (x50lh2ztY7Y5 == null) {
            synchronized (cpQdD2nAriOS) {
                try {
                    if (x50lh2ztY7Y5 == null) {
                        x50lh2ztY7Y5 = new m9(context);
                    }
                } finally {
                }
            }
        }
        return x50lh2ztY7Y5;
    }

    @Override // defpackage.g82
    public y52 BRwzKIf41E4i() {
        switch (this.rtx2ld2ELZv4) {
            case 3:
                return (ds1) this.dgRBjINgWbAK;
            default:
                return (z60) this.OPXfSBeufaJ8;
        }
    }

    public void BjEWd04qc7Mw(cw0 cw0Var) {
        ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.lS5Rgt96tfkO = cw0Var;
    }

    public p21 EcgxDIVH5in8() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((ib0) this.dgRBjINgWbAK)) {
            try {
                p21 p21Var = (p21) this.wdg6QnbFHrFF;
                if (p21Var != null && localeList == ((LocaleList) this.OPXfSBeufaJ8)) {
                    return p21Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new n21(localeList.get(i)));
                }
                p21 p21Var2 = new p21(arrayList);
                this.OPXfSBeufaJ8 = localeList;
                this.wdg6QnbFHrFF = p21Var2;
                return p21Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean IAToe7bXGz4N() {
        if (((i92) this.OPXfSBeufaJ8).getValue() != this.dgRBjINgWbAK) {
            return true;
        }
        m9 m9Var = (m9) this.wdg6QnbFHrFF;
        return m9Var != null && m9Var.IAToe7bXGz4N();
    }

    @Override // defpackage.r9
    public Object OPXfSBeufaJ8() {
        return this.dgRBjINgWbAK;
    }

    public void PxuCJdSBwIXG(vw0 vw0Var, js0 js0Var) {
        i2 i2Var = (i2) this.OPXfSBeufaJ8;
        i2 i2Var2 = (i2) this.wdg6QnbFHrFF;
        i2 i2Var3 = (i2) this.dgRBjINgWbAK;
        int ordinal = js0Var.ordinal();
        if (ordinal == 0) {
            i2Var.TSizfFm2Yiuu(vw0Var);
            i2Var3.TSizfFm2Yiuu(vw0Var);
            return;
        }
        if (ordinal == 1) {
            i2Var2.TSizfFm2Yiuu(vw0Var);
            i2Var3.TSizfFm2Yiuu(vw0Var);
            return;
        }
        if (ordinal == 2) {
            if (vw0Var.QrzZRwfaDlRX != null) {
                i2Var3.TSizfFm2Yiuu(vw0Var);
                return;
            } else {
                i2Var.TSizfFm2Yiuu(vw0Var);
                return;
            }
        }
        if (ordinal != 3) {
            u9.gPXPFXrUH4XX();
        } else if (vw0Var.QrzZRwfaDlRX != null) {
            i2Var3.TSizfFm2Yiuu(vw0Var);
        } else {
            i2Var2.TSizfFm2Yiuu(vw0Var);
        }
    }

    public Object QrzZRwfaDlRX() {
        long VhhvGxCb8gfr = xi0.VhhvGxCb8gfr();
        if (VhhvGxCb8gfr == sj2.PxuCJdSBwIXG) {
            return this.dgRBjINgWbAK;
        }
        pj2 pj2Var = (pj2) ((AtomicReference) this.OPXfSBeufaJ8).get();
        int PxuCJdSBwIXG = pj2Var.PxuCJdSBwIXG(VhhvGxCb8gfr);
        if (PxuCJdSBwIXG >= 0) {
            return pj2Var.TSizfFm2Yiuu[PxuCJdSBwIXG];
        }
        return null;
    }

    @Override // defpackage.r9
    public void RAsUl2FVSrh6() {
        ei1 ei1Var = ((vw0) this.OPXfSBeufaJ8).S9EYkSpbGuxq;
        if (ei1Var != null) {
            ((r1) ei1Var).pnx5pC0XzaCw();
        }
    }

    @Override // defpackage.r9
    public void RfyTYNmI9Srp() {
        this.dgRBjINgWbAK = ((ArrayList) this.wdg6QnbFHrFF).remove(r0.size() - 1);
    }

    public long S2OOm9zPNm0h() {
        return ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.Y1f8riQaR6yg;
    }

    @Override // defpackage.r9
    public void TSizfFm2Yiuu(int i, Object obj) {
        ((vw0) this.dgRBjINgWbAK).aF05bpZJlKEP(i, (vw0) obj);
    }

    public bv0 VhhvGxCb8gfr() {
        bv0 bv0Var = (bv0) this.wdg6QnbFHrFF;
        if (bv0Var != null) {
            return bv0Var;
        }
        cs0.tmVwIGCQF4zR("keyboardActions");
        throw null;
    }

    @Override // defpackage.g82
    public o82 XL4ISE6Oc65B() {
        switch (this.rtx2ld2ELZv4) {
            case 3:
                return (es1) this.wdg6QnbFHrFF;
            default:
                return (a70) this.wdg6QnbFHrFF;
        }
    }

    @Override // defpackage.r9
    public void Y1f8riQaR6yg(Object obj) {
        ((ArrayList) this.wdg6QnbFHrFF).add(this.dgRBjINgWbAK);
        this.dgRBjINgWbAK = obj;
    }

    public boolean ZbWwgt3aGe7A(CharSequence charSequence, int i, int i2, xm2 xm2Var) {
        if ((xm2Var.TSizfFm2Yiuu & 3) == 0) {
            nw nwVar = (nw) this.dgRBjINgWbAK;
            z51 lS5Rgt96tfkO = xm2Var.lS5Rgt96tfkO();
            int PxuCJdSBwIXG = lS5Rgt96tfkO.PxuCJdSBwIXG(8);
            if (PxuCJdSBwIXG != 0) {
                ((ByteBuffer) lS5Rgt96tfkO.dgRBjINgWbAK).getShort(PxuCJdSBwIXG + lS5Rgt96tfkO.rtx2ld2ELZv4);
            }
            nwVar.getClass();
            ThreadLocal threadLocal = nw.lS5Rgt96tfkO;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = nwVar.PxuCJdSBwIXG.hasGlyph(sb.toString());
            int i3 = xm2Var.TSizfFm2Yiuu & 4;
            xm2Var.TSizfFm2Yiuu = hasGlyph ? i3 | 2 : i3 | 1;
        }
        return (xm2Var.TSizfFm2Yiuu & 3) == 2;
    }

    @Override // defpackage.r9
    public /* bridge */ /* synthetic */ void a92UlCVFR9N8(int i, Object obj) {
    }

    public void aF05bpZJlKEP(Object obj) {
        long VhhvGxCb8gfr = xi0.VhhvGxCb8gfr();
        if (VhhvGxCb8gfr == sj2.PxuCJdSBwIXG) {
            this.dgRBjINgWbAK = obj;
            return;
        }
        synchronized (this.wdg6QnbFHrFF) {
            pj2 pj2Var = (pj2) ((AtomicReference) this.OPXfSBeufaJ8).get();
            int PxuCJdSBwIXG = pj2Var.PxuCJdSBwIXG(VhhvGxCb8gfr);
            if (PxuCJdSBwIXG < 0) {
                ((AtomicReference) this.OPXfSBeufaJ8).set(pj2Var.lS5Rgt96tfkO(VhhvGxCb8gfr, obj));
            } else {
                pj2Var.TSizfFm2Yiuu[PxuCJdSBwIXG] = obj;
            }
        }
    }

    @Override // defpackage.g82
    public void cancel() {
        switch (this.rtx2ld2ELZv4) {
            case 3:
                ((g82) this.OPXfSBeufaJ8).cancel();
                break;
            default:
                ((d70) ((jv) this.dgRBjINgWbAK).Y1f8riQaR6yg).cancel();
                break;
        }
    }

    public boolean dgRBjINgWbAK(vw0 vw0Var) {
        return !(vw0Var.QrzZRwfaDlRX == null) && (((n82) ((i2) this.OPXfSBeufaJ8).OPXfSBeufaJ8).contains(vw0Var) || ((n82) ((i2) this.wdg6QnbFHrFF).OPXfSBeufaJ8).contains(vw0Var));
    }

    public Object e6tOsSdd2EFb(CharSequence charSequence, int i, int i2, int i3, boolean z, d50 d50Var) {
        int i4;
        char c;
        g50 g50Var = new g50((b61) ((e0) this.wdg6QnbFHrFF).dgRBjINgWbAK);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                SparseArray sparseArray = g50Var.TSizfFm2Yiuu.PxuCJdSBwIXG;
                b61 b61Var = sparseArray == null ? null : (b61) sparseArray.get(codePointAt);
                if (g50Var.PxuCJdSBwIXG == 2) {
                    if (b61Var != null) {
                        g50Var.TSizfFm2Yiuu = b61Var;
                        g50Var.a92UlCVFR9N8++;
                    } else {
                        if (codePointAt == 65038) {
                            g50Var.PxuCJdSBwIXG();
                        } else if (codePointAt != 65039) {
                            b61 b61Var2 = g50Var.TSizfFm2Yiuu;
                            if (b61Var2.lS5Rgt96tfkO != null) {
                                if (g50Var.a92UlCVFR9N8 != 1) {
                                    g50Var.Y1f8riQaR6yg = b61Var2;
                                    g50Var.PxuCJdSBwIXG();
                                } else if (g50Var.lS5Rgt96tfkO()) {
                                    g50Var.Y1f8riQaR6yg = g50Var.TSizfFm2Yiuu;
                                    g50Var.PxuCJdSBwIXG();
                                } else {
                                    g50Var.PxuCJdSBwIXG();
                                }
                                c = 3;
                            } else {
                                g50Var.PxuCJdSBwIXG();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (b61Var == null) {
                    g50Var.PxuCJdSBwIXG();
                    c = 1;
                } else {
                    g50Var.PxuCJdSBwIXG = 2;
                    g50Var.TSizfFm2Yiuu = b61Var;
                    g50Var.a92UlCVFR9N8 = 1;
                    c = 2;
                }
                g50Var.e9gEMXR7LXtO = codePointAt;
                if (c == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c == 3) {
                    if (z || !ZbWwgt3aGe7A(charSequence, i4, i6, g50Var.Y1f8riQaR6yg.lS5Rgt96tfkO)) {
                        z2 = d50Var.lS5Rgt96tfkO(charSequence, i4, i6, g50Var.Y1f8riQaR6yg.lS5Rgt96tfkO);
                        i5++;
                    }
                }
            }
        }
        if (g50Var.PxuCJdSBwIXG == 2 && g50Var.TSizfFm2Yiuu.lS5Rgt96tfkO != null && ((g50Var.a92UlCVFR9N8 > 1 || g50Var.lS5Rgt96tfkO()) && i5 < i3 && z2 && (z || !ZbWwgt3aGe7A(charSequence, i4, i6, g50Var.TSizfFm2Yiuu.lS5Rgt96tfkO)))) {
            d50Var.lS5Rgt96tfkO(charSequence, i4, i6, g50Var.TSizfFm2Yiuu.lS5Rgt96tfkO);
        }
        return d50Var.PxuCJdSBwIXG();
    }

    @Override // defpackage.r9
    public void e9gEMXR7LXtO() {
        st1 rectManager;
        r0 r0Var;
        st1 rectManager2;
        vw0 vw0Var = (vw0) this.dgRBjINgWbAK;
        kd1 kd1Var = vw0Var.nLZGh9p8gVSu;
        if (!vw0Var.J54yh1s3n4Aq()) {
            ep0.PxuCJdSBwIXG("onReuse is only expected on attached node");
        }
        jx0 jx0Var = vw0Var.amuv7NJvPxHu;
        if (jx0Var != null) {
            jx0Var.OPXfSBeufaJ8(false);
        }
        vw0Var.IAToe7bXGz4N = false;
        if (vw0Var.xbgXKYA2cIfu) {
            vw0Var.xbgXKYA2cIfu = false;
        } else {
            m61 m61Var = vw0Var.nLZGh9p8gVSu.e9gEMXR7LXtO;
            for (m61 m61Var2 = m61Var; m61Var2 != null; m61Var2 = m61Var2.x50lh2ztY7Y5) {
                if (m61Var2.S9EYkSpbGuxq) {
                    m61Var2.wnqUPcAvl7HT();
                }
            }
            for (m61 m61Var3 = m61Var; m61Var3 != null; m61Var3 = m61Var3.x50lh2ztY7Y5) {
                if (m61Var3.S9EYkSpbGuxq) {
                    m61Var3.Y2PHjkwWz56c();
                }
            }
            while (m61Var != null) {
                if (m61Var.S9EYkSpbGuxq) {
                    m61Var.twy4zb2fCtqq();
                }
                m61Var = m61Var.x50lh2ztY7Y5;
            }
        }
        int i = vw0Var.OPXfSBeufaJ8;
        ei1 ei1Var = vw0Var.S9EYkSpbGuxq;
        if (ei1Var != null && (rectManager2 = ((r1) ei1Var).getRectManager()) != null) {
            rectManager2.RAsUl2FVSrh6(vw0Var);
        }
        vw0Var.OPXfSBeufaJ8 = a32.PxuCJdSBwIXG.addAndGet(1);
        ei1 ei1Var2 = vw0Var.S9EYkSpbGuxq;
        if (ei1Var2 != null) {
            r1 r1Var = (r1) ei1Var2;
            r1Var.m17getLayoutNodes().RAsUl2FVSrh6(i);
            r1Var.m17getLayoutNodes().rtx2ld2ELZv4(vw0Var.OPXfSBeufaJ8, vw0Var);
        }
        for (m61 m61Var4 = kd1Var.a92UlCVFR9N8; m61Var4 != null; m61Var4 = m61Var4.cpQdD2nAriOS) {
            m61Var4.HqMwxkFaipxD();
        }
        kd1Var.e9gEMXR7LXtO();
        if (kd1Var.Y1f8riQaR6yg(8)) {
            vw0Var.ozEBbv0hFTAB();
        }
        vw0.JHNfcAUfKc4G(vw0Var);
        ei1 ei1Var3 = vw0Var.S9EYkSpbGuxq;
        if (ei1Var3 != null) {
            r1 r1Var2 = (r1) ei1Var3;
            if (r1.RAsUl2FVSrh6() && (r0Var = r1Var2.wLFCmsViZrNT) != null) {
                r1 r1Var3 = r0Var.wdg6QnbFHrFF;
                i2 i2Var = r0Var.rtx2ld2ELZv4;
                d81 d81Var = r0Var.QrzZRwfaDlRX;
                if (d81Var.e9gEMXR7LXtO(i)) {
                    i2Var.rtx2ld2ELZv4(r1Var3, i, false);
                }
                z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
                if (S2OOm9zPNm0h != null && S2OOm9zPNm0h.rtx2ld2ELZv4.lS5Rgt96tfkO(h32.XL4ISE6Oc65B)) {
                    d81Var.PxuCJdSBwIXG(vw0Var.OPXfSBeufaJ8);
                    i2Var.rtx2ld2ELZv4(r1Var3, vw0Var.OPXfSBeufaJ8, true);
                }
            }
        }
        ei1 ei1Var4 = vw0Var.S9EYkSpbGuxq;
        if (ei1Var4 == null || (rectManager = ((r1) ei1Var4).getRectManager()) == null) {
            return;
        }
        rectManager.a92UlCVFR9N8(vw0Var);
    }

    public gi gPXPFXrUH4XX() {
        return ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.TSizfFm2Yiuu;
    }

    public boolean jyegZNwi31qc(int i) {
        j82 j82Var;
        jn0.Companion.getClass();
        if (i == 7) {
            VhhvGxCb8gfr();
        } else if (i == 2) {
            VhhvGxCb8gfr();
        } else if (i == 6) {
            VhhvGxCb8gfr();
        } else if (i == 5) {
            VhhvGxCb8gfr();
        } else if (i == 3) {
            VhhvGxCb8gfr();
        } else if (i == 4) {
            VhhvGxCb8gfr();
        } else if (i != 1 && i != 0) {
            u9.rtx2ld2ELZv4("invalid ImeAction");
            return false;
        }
        if (i == 6) {
            na0 na0Var = (na0) this.dgRBjINgWbAK;
            if (na0Var == null) {
                cs0.tmVwIGCQF4zR("focusManager");
                throw null;
            }
            ga0.Companion.getClass();
            ((qa0) na0Var).RAsUl2FVSrh6(1, true);
            return true;
        }
        if (i != 5) {
            if (i != 7 || (j82Var = (j82) this.OPXfSBeufaJ8) == null) {
                return false;
            }
            ((wx) j82Var).PxuCJdSBwIXG();
            return true;
        }
        na0 na0Var2 = (na0) this.dgRBjINgWbAK;
        if (na0Var2 == null) {
            cs0.tmVwIGCQF4zR("focusManager");
            throw null;
        }
        ga0.Companion.getClass();
        ((qa0) na0Var2).RAsUl2FVSrh6(2, true);
        return true;
    }

    public void kpCQ9veP6n3I(gi giVar) {
        ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.TSizfFm2Yiuu = giVar;
    }

    public void lS5Rgt96tfkO() {
        ((ArrayList) this.wdg6QnbFHrFF).clear();
        this.dgRBjINgWbAK = this.OPXfSBeufaJ8;
        ((vw0) this.OPXfSBeufaJ8).POWyO8hTM6YC();
    }

    public void ozEBbv0hFTAB(long j) {
        ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.Y1f8riQaR6yg = j;
    }

    public boolean pnx5pC0XzaCw() {
        return !(((n82) ((i2) this.OPXfSBeufaJ8).OPXfSBeufaJ8).isEmpty() && ((n82) ((i2) this.dgRBjINgWbAK).OPXfSBeufaJ8).isEmpty() && ((n82) ((i2) this.wdg6QnbFHrFF).OPXfSBeufaJ8).isEmpty());
    }

    public Object r3s1LDPKFs1S(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.OPXfSBeufaJ8;
        if (sj0.BjEWd04qc7Mw()) {
            try {
                sj0.wdg6QnbFHrFF(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                yo0 yo0Var = (yo0) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> PxuCJdSBwIXG = yo0Var.PxuCJdSBwIXG();
                if (!PxuCJdSBwIXG.isEmpty()) {
                    for (Class cls2 : PxuCJdSBwIXG) {
                        if (!hashMap.containsKey(cls2)) {
                            r3s1LDPKFs1S(cls2, hashSet);
                        }
                    }
                }
                obj = yo0Var.lS5Rgt96tfkO((Context) this.dgRBjINgWbAK);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new tm(th);
            }
        }
        return obj;
    }

    public void rZjpSjn4zoMv(hy hyVar) {
        ((ji) this.dgRBjINgWbAK).rtx2ld2ELZv4.PxuCJdSBwIXG = hyVar;
    }

    @Override // defpackage.r9
    public void rtx2ld2ELZv4(int i, int i2, int i3) {
        ((vw0) this.dgRBjINgWbAK).ryVscX7ZL4Ux(i, i2, i3);
    }

    public void tmVwIGCQF4zR() {
        v81 v81Var = (v81) this.OPXfSBeufaJ8;
        String str = (String) this.wdg6QnbFHrFF;
        List list = (List) v81Var.dgRBjINgWbAK(str);
        if (list != null) {
            list.remove((ae0) this.dgRBjINgWbAK);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        v81Var.cpQdD2nAriOS(str, list);
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 13:
                String str = (String) this.dgRBjINgWbAK;
                String str2 = (String) this.wdg6QnbFHrFF;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.OPXfSBeufaJ8;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.r9
    public void wdg6QnbFHrFF(int i, int i2) {
        ((vw0) this.dgRBjINgWbAK).i68hK7ahKtgp(i, i2);
    }

    public void x50lh2ztY7Y5(Bundle bundle) {
        HashSet hashSet = (HashSet) this.wdg6QnbFHrFF;
        String string = ((Context) this.dgRBjINgWbAK).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (yo0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    r3s1LDPKFs1S((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new tm(e);
            }
        }
    }

    public m9(at1 at1Var) {
        this.rtx2ld2ELZv4 = 14;
        this.OPXfSBeufaJ8 = new bb(0);
        this.wdg6QnbFHrFF = new xb();
        this.dgRBjINgWbAK = new e6(18, this, at1Var);
    }

    public m9(int i) {
        this.rtx2ld2ELZv4 = i;
        int i2 = 18;
        switch (i) {
            case 2:
                this.OPXfSBeufaJ8 = new b41(16);
                long[] jArr = c02.PxuCJdSBwIXG;
                this.wdg6QnbFHrFF = new v81();
                this.dgRBjINgWbAK = new ib0(i2);
                break;
            case 5:
                break;
            case 6:
                this.OPXfSBeufaJ8 = new i2(8, (byte) 0);
                this.wdg6QnbFHrFF = new i2(8, (byte) 0);
                this.dgRBjINgWbAK = new i2(8, (byte) 0);
                break;
            case 9:
                this.OPXfSBeufaJ8 = new v81();
                break;
            case 16:
                long[] jArr2 = c02.PxuCJdSBwIXG;
                this.OPXfSBeufaJ8 = new v81();
                break;
            case 18:
                this.OPXfSBeufaJ8 = new AtomicReference(f2.IAToe7bXGz4N);
                this.wdg6QnbFHrFF = new Object();
                break;
            case 20:
                this.OPXfSBeufaJ8 = new WeakHashMap();
                this.wdg6QnbFHrFF = new WeakHashMap();
                this.dgRBjINgWbAK = new WeakHashMap();
                break;
            default:
                this.dgRBjINgWbAK = new ib0(i2);
                break;
        }
    }

    public m9(g82 g82Var) {
        this.rtx2ld2ELZv4 = 3;
        this.OPXfSBeufaJ8 = g82Var;
        o82 XL4ISE6Oc65B = g82Var.XL4ISE6Oc65B();
        XL4ISE6Oc65B.getClass();
        this.wdg6QnbFHrFF = new es1(XL4ISE6Oc65B);
        y52 BRwzKIf41E4i = g82Var.BRwzKIf41E4i();
        BRwzKIf41E4i.getClass();
        this.dgRBjINgWbAK = new ds1(BRwzKIf41E4i);
    }

    public m9(j82 j82Var) {
        this.rtx2ld2ELZv4 = 11;
        this.OPXfSBeufaJ8 = j82Var;
    }

    public m9(View view) {
        this.rtx2ld2ELZv4 = 10;
        this.OPXfSBeufaJ8 = view;
        this.wdg6QnbFHrFF = vi0.ryVscX7ZL4Ux(pz0.OPXfSBeufaJ8, new y4(5, this));
        this.dgRBjINgWbAK = new b42(view);
    }

    public /* synthetic */ m9(Object obj, Object obj2, Object obj3, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
        this.wdg6QnbFHrFF = obj2;
        this.dgRBjINgWbAK = obj3;
    }

    public m9(ji jiVar) {
        this.rtx2ld2ELZv4 = 4;
        this.dgRBjINgWbAK = jiVar;
        this.OPXfSBeufaJ8 = new i2(2, this);
    }

    public m9(Context context) {
        this.rtx2ld2ELZv4 = 0;
        this.dgRBjINgWbAK = context.getApplicationContext();
        this.wdg6QnbFHrFF = new HashSet();
        this.OPXfSBeufaJ8 = new HashMap();
    }

    public m9(e0 e0Var, jx1 jx1Var, nw nwVar, Set set) {
        this.rtx2ld2ELZv4 = 7;
        this.OPXfSBeufaJ8 = jx1Var;
        this.wdg6QnbFHrFF = e0Var;
        this.dgRBjINgWbAK = nwVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            e6tOsSdd2EFb(str, 0, str.length(), 1, true, new f50(str, 0));
        }
    }

    public m9(jv jvVar) {
        this.rtx2ld2ELZv4 = 8;
        this.dgRBjINgWbAK = jvVar;
        d70 d70Var = (d70) jvVar.Y1f8riQaR6yg;
        this.OPXfSBeufaJ8 = new z60(jvVar, d70Var.a92UlCVFR9N8().BRwzKIf41E4i(), -1L, true);
        this.wdg6QnbFHrFF = new a70(jvVar, d70Var.a92UlCVFR9N8().XL4ISE6Oc65B(), -1L, true);
    }

    public m9(cn2 cn2Var, m9 m9Var) {
        this.rtx2ld2ELZv4 = 19;
        this.OPXfSBeufaJ8 = cn2Var;
        this.wdg6QnbFHrFF = m9Var;
        this.dgRBjINgWbAK = cn2Var.getValue();
    }

    public m9(vw0 vw0Var) {
        this.rtx2ld2ELZv4 = 21;
        this.OPXfSBeufaJ8 = vw0Var;
        this.wdg6QnbFHrFF = new ArrayList();
        this.dgRBjINgWbAK = vw0Var;
    }
}
