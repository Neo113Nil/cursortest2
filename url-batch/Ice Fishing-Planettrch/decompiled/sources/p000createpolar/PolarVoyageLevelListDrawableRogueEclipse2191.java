package p000createpolar;

import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-8b11a357a473f42949ec352239e0d5cff1c9f920f781009416889c17ee09d569 */
/* loaded from: classes.dex */
public final class PolarVoyageLevelListDrawableRogueEclipse2191 implements Parcelable {
    public static final Parcelable.Creator<PolarVoyageLevelListDrawableRogueEclipse2191> CREATOR = new PolarVoyageVideoCaptureOlympianNovaX3124(21);
    public final Messenger PolarVoyageItemDecorationUltraDeltaEpic7485;

    public PolarVoyageLevelListDrawableRogueEclipse2191(IBinder iBinder) {
        this.PolarVoyageItemDecorationUltraDeltaEpic7485 = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
            messenger.getClass();
            IBinder binder = messenger.getBinder();
            Messenger messenger2 = ((PolarVoyageLevelListDrawableRogueEclipse2191) obj).PolarVoyageItemDecorationUltraDeltaEpic7485;
            messenger2.getClass();
            return binder.equals(messenger2.getBinder());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.PolarVoyageItemDecorationUltraDeltaEpic7485;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
