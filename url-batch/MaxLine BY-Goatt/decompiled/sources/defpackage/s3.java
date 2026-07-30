package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.s3;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s3 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    public /* synthetic */ s3(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0277  */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createFromParcel(final Parcel parcel) {
        Uri uri;
        Bundle bundle;
        int i = 0;
        int i2 = 0;
        ArrayList arrayList = null;
        d01 d01Var = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new t3(parcel.readInt(), parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null);
            case 1:
                og ogVar = new og(parcel);
                ogVar.m = parcel.readByte() != 0;
                return ogVar;
            case 2:
                return new xm(parcel);
            case 3:
                return new ym(parcel);
            case 4:
                return new k80(parcel.readInt());
            case 5:
                xr0 xr0Var = new xr0();
                xr0Var.m = parcel.readString();
                xr0Var.n = parcel.readInt();
                return xr0Var;
            case 6:
                cs0 cs0Var = new cs0();
                cs0Var.q = null;
                cs0Var.r = new ArrayList();
                cs0Var.s = new ArrayList();
                cs0Var.m = parcel.createStringArrayList();
                cs0Var.n = parcel.createStringArrayList();
                cs0Var.o = (xm[]) parcel.createTypedArray(xm.CREATOR);
                cs0Var.p = parcel.readInt();
                cs0Var.q = parcel.readString();
                cs0Var.r = parcel.createStringArrayList();
                cs0Var.s = parcel.createTypedArrayList(ym.CREATOR);
                cs0Var.t = parcel.createTypedArrayList(xr0.CREATOR);
                return cs0Var;
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new hs0(parcel);
            case 8:
                parcel.getClass();
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                readParcelable.getClass();
                return new z31((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 9:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new s3(9);
                    public final int m;
                    public final MediaDescriptionCompat n;

                    {
                        this.m = parcel.readInt();
                        this.n = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.m + ", mDescription=" + this.n + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i3) {
                        parcel2.writeInt(this.m);
                        this.n.writeToParcel(parcel2, i3);
                    }
                };
            case 10:
                Object createFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (createFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) createFromParcel;
                String mediaId = mediaDescription.getMediaId();
                CharSequence title = mediaDescription.getTitle();
                CharSequence subtitle = mediaDescription.getSubtitle();
                CharSequence description = mediaDescription.getDescription();
                Bitmap iconBitmap = mediaDescription.getIconBitmap();
                Uri iconUri = mediaDescription.getIconUri();
                Bundle extras = mediaDescription.getExtras();
                if (extras != null) {
                    extras.setClassLoader(yj1.class.getClassLoader());
                    uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
                } else {
                    uri = null;
                }
                if (uri != null) {
                    if (extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && extras.size() == 2) {
                        bundle = null;
                        if (uri == null) {
                            uri = mediaDescription.getMediaUri();
                        }
                        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                        mediaDescriptionCompat.u = createFromParcel;
                        return mediaDescriptionCompat;
                    }
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
                bundle = extras;
                if (uri == null) {
                }
                MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, uri);
                mediaDescriptionCompat2.u = createFromParcel;
                return mediaDescriptionCompat2;
            case 11:
                return new MediaMetadataCompat(parcel);
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new s3(12);
                    public final MediaDescriptionCompat m;
                    public final long n;

                    {
                        this.m = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.n = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.m + ", Id=" + this.n + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i3) {
                        this.m.writeToParcel(parcel2, i3);
                        parcel2.writeLong(this.n);
                    }
                };
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper = new MediaSessionCompat$ResultReceiverWrapper();
                mediaSessionCompat$ResultReceiverWrapper.m = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return mediaSessionCompat$ResultReceiverWrapper;
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                final Parcelable readParcelable2 = parcel.readParcelable(null);
                return new Parcelable(readParcelable2) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new s3(14);
                    public final Object m;

                    {
                        this.m = readParcelable2;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof MediaSessionCompat$Token)) {
                            return false;
                        }
                        Object obj2 = ((MediaSessionCompat$Token) obj).m;
                        Object obj3 = this.m;
                        if (obj3 == null) {
                            return obj2 == null;
                        }
                        if (obj2 == null) {
                            return false;
                        }
                        return obj3.equals(obj2);
                    }

                    public final int hashCode() {
                        Object obj = this.m;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i3) {
                        parcel2.writeParcelable((Parcelable) this.m, i3);
                    }
                };
            case 15:
                String readString = parcel.readString();
                readString.getClass();
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i3 = 0; i3 < readInt; i3++) {
                    String readString2 = parcel.readString();
                    readString2.getClass();
                    String readString3 = parcel.readString();
                    readString3.getClass();
                    linkedHashMap.put(readString2, readString3);
                }
                return new ak1(readString, linkedHashMap);
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                parcel.getClass();
                return new dp1(parcel);
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                pr1 pr1Var = new pr1(parcel);
                pr1Var.m = parcel.readInt();
                return pr1Var;
            case 18:
                return new ParcelImpl(parcel);
            case 19:
                return new hz1(parcel.readFloat());
            case 20:
                return new iz1(parcel.readInt());
            case 21:
                return new jz1(parcel.readLong());
            case 22:
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
                parcelableVolumeInfo.m = parcel.readInt();
                parcelableVolumeInfo.o = parcel.readInt();
                parcelableVolumeInfo.p = parcel.readInt();
                parcelableVolumeInfo.q = parcel.readInt();
                parcelableVolumeInfo.n = parcel.readInt();
                return parcelableVolumeInfo;
            case 23:
                return new PlaybackStateCompat(parcel);
            case 24:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case Constants.MAX_TREE_DEPTH /* 25 */:
                ea2 ea2Var = new ea2();
                IBinder readStrongBinder = parcel.readStrongBinder();
                int i4 = da2.h;
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(d01.f);
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof d01)) {
                        c01 c01Var = new c01();
                        c01Var.g = readStrongBinder;
                        d01Var = c01Var;
                    } else {
                        d01Var = (d01) queryLocalInterface;
                    }
                }
                ea2Var.m = d01Var;
                return ea2Var;
            case 26:
                int j0 = tk3.j0(parcel);
                while (parcel.dataPosition() < j0) {
                    int readInt2 = parcel.readInt();
                    char c = (char) readInt2;
                    if (c == 1) {
                        i2 = tk3.a0(parcel, readInt2);
                    } else if (c != 2) {
                        tk3.f0(parcel, readInt2);
                    } else {
                        arrayList = tk3.I(parcel, readInt2, nl1.CREATOR);
                    }
                }
                tk3.L(parcel, j0);
                return new st2(i2, arrayList);
            case 27:
                int j02 = tk3.j0(parcel);
                Intent intent = null;
                int i5 = 0;
                while (parcel.dataPosition() < j02) {
                    int readInt3 = parcel.readInt();
                    char c2 = (char) readInt3;
                    if (c2 == 1) {
                        i = tk3.a0(parcel, readInt3);
                    } else if (c2 == 2) {
                        i5 = tk3.a0(parcel, readInt3);
                    } else if (c2 != 3) {
                        tk3.f0(parcel, readInt3);
                    } else {
                        intent = (Intent) tk3.F(parcel, readInt3, Intent.CREATOR);
                    }
                }
                tk3.L(parcel, j02);
                return new v93(i, i5, intent);
            case 28:
                int j03 = tk3.j0(parcel);
                int i6 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri2 = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList2 = null;
                String str7 = null;
                String str8 = null;
                long j = 0;
                while (parcel.dataPosition() < j03) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i6 = tk3.a0(parcel, readInt4);
                            break;
                        case 2:
                            str = tk3.G(parcel, readInt4);
                            break;
                        case 3:
                            str2 = tk3.G(parcel, readInt4);
                            break;
                        case 4:
                            str3 = tk3.G(parcel, readInt4);
                            break;
                        case 5:
                            str4 = tk3.G(parcel, readInt4);
                            break;
                        case 6:
                            uri2 = (Uri) tk3.F(parcel, readInt4, Uri.CREATOR);
                            break;
                        case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                            str5 = tk3.G(parcel, readInt4);
                            break;
                        case '\b':
                            j = tk3.b0(parcel, readInt4);
                            break;
                        case '\t':
                            str6 = tk3.G(parcel, readInt4);
                            break;
                        case '\n':
                            arrayList2 = tk3.I(parcel, readInt4, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = tk3.G(parcel, readInt4);
                            break;
                        case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                            str8 = tk3.G(parcel, readInt4);
                            break;
                        default:
                            tk3.f0(parcel, readInt4);
                            break;
                    }
                }
                tk3.L(parcel, j03);
                return new GoogleSignInAccount(i6, str, str2, str3, str4, uri2, str5, j, str6, arrayList2, str7, str8);
            default:
                int j04 = tk3.j0(parcel);
                ArrayList<String> arrayList3 = null;
                String str9 = null;
                while (parcel.dataPosition() < j04) {
                    int readInt5 = parcel.readInt();
                    char c3 = (char) readInt5;
                    if (c3 == 1) {
                        int c0 = tk3.c0(parcel, readInt5);
                        int dataPosition = parcel.dataPosition();
                        if (c0 == 0) {
                            arrayList3 = null;
                        } else {
                            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(dataPosition + c0);
                            arrayList3 = createStringArrayList;
                        }
                    } else if (c3 != 2) {
                        tk3.f0(parcel, readInt5);
                    } else {
                        str9 = tk3.G(parcel, readInt5);
                    }
                }
                tk3.L(parcel, j04);
                return new qa3(str9, arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t3[i];
            case 1:
                return new og[i];
            case 2:
                return new xm[i];
            case 3:
                return new ym[i];
            case 4:
                return new k80[i];
            case 5:
                return new xr0[i];
            case 6:
                return new cs0[i];
            case l42.DOUBLE_FIELD_NUMBER /* 7 */:
                return new hs0[i];
            case 8:
                return new z31[i];
            case 9:
                return new MediaBrowserCompat$MediaItem[i];
            case 10:
                return new MediaDescriptionCompat[i];
            case 11:
                return new MediaMetadataCompat[i];
            case ViewHierarchyConstants.PICKER_BITMASK /* 12 */:
                return new MediaSessionCompat$QueueItem[i];
            case ViewHierarchyConstants.SWITCH_BITMASK /* 13 */:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case ViewHierarchyConstants.RADIO_GROUP_BITMASK /* 14 */:
                return new MediaSessionCompat$Token[i];
            case 15:
                return new ak1[i];
            case ViewHierarchyConstants.RATINGBAR_BITMASK /* 16 */:
                return new dp1[i];
            case FacebookRequestErrorClassification.EC_USER_TOO_MANY_CALLS /* 17 */:
                return new pr1[i];
            case 18:
                return new ParcelImpl[i];
            case 19:
                return new hz1[i];
            case 20:
                return new iz1[i];
            case 21:
                return new jz1[i];
            case 22:
                return new ParcelableVolumeInfo[i];
            case 23:
                return new PlaybackStateCompat[i];
            case 24:
                return new RatingCompat[i];
            case Constants.MAX_TREE_DEPTH /* 25 */:
                return new ea2[i];
            case 26:
                return new st2[i];
            case 27:
                return new v93[i];
            case 28:
                return new GoogleSignInAccount[i];
            default:
                return new qa3[i];
        }
    }
}
