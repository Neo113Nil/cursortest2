package androidx.media2.session;

import android.app.PendingIntent;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.ParcelImplListSlice;
import androidx.media2.common.SessionPlayer$TrackInfo;
import androidx.media2.common.VideoSize;

/* loaded from: classes.dex */
public final class ConnectionResultParcelizer {
    public static ConnectionResult read(androidx.versionedparcelable.a aVar) {
        ConnectionResult connectionResult = new ConnectionResult();
        connectionResult.f1143a = aVar.v(connectionResult.f1143a, 0);
        connectionResult.f1145c = aVar.G(connectionResult.f1145c, 1);
        connectionResult.f1155m = aVar.v(connectionResult.f1155m, 10);
        connectionResult.f1156n = aVar.v(connectionResult.f1156n, 11);
        connectionResult.f1157o = (ParcelImplListSlice) aVar.A(connectionResult.f1157o, 12);
        connectionResult.f1158p = (SessionCommandGroup) aVar.I(connectionResult.f1158p, 13);
        connectionResult.f1159q = aVar.v(connectionResult.f1159q, 14);
        connectionResult.f1160r = aVar.v(connectionResult.f1160r, 15);
        connectionResult.f1161s = aVar.v(connectionResult.f1161s, 16);
        connectionResult.f1162t = aVar.k(connectionResult.f1162t, 17);
        connectionResult.f1163u = (VideoSize) aVar.I(connectionResult.f1163u, 18);
        connectionResult.f1164v = aVar.w(connectionResult.f1164v, 19);
        connectionResult.f1146d = (PendingIntent) aVar.A(connectionResult.f1146d, 2);
        connectionResult.f1165w = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f1165w, 20);
        connectionResult.f1166x = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f1166x, 21);
        connectionResult.f1167y = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f1167y, 23);
        connectionResult.f1168z = (SessionPlayer$TrackInfo) aVar.I(connectionResult.f1168z, 24);
        connectionResult.A = (MediaMetadata) aVar.I(connectionResult.A, 25);
        connectionResult.B = aVar.v(connectionResult.B, 26);
        connectionResult.f1147e = aVar.v(connectionResult.f1147e, 3);
        connectionResult.f1149g = (MediaItem) aVar.I(connectionResult.f1149g, 4);
        connectionResult.f1150h = aVar.y(connectionResult.f1150h, 5);
        connectionResult.f1151i = aVar.y(connectionResult.f1151i, 6);
        connectionResult.f1152j = aVar.s(connectionResult.f1152j, 7);
        connectionResult.f1153k = aVar.y(connectionResult.f1153k, 8);
        connectionResult.f1154l = (MediaController$PlaybackInfo) aVar.I(connectionResult.f1154l, 9);
        connectionResult.c();
        return connectionResult;
    }

    public static void write(ConnectionResult connectionResult, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        connectionResult.d(aVar.g());
        aVar.Y(connectionResult.f1143a, 0);
        aVar.j0(connectionResult.f1145c, 1);
        aVar.Y(connectionResult.f1155m, 10);
        aVar.Y(connectionResult.f1156n, 11);
        aVar.d0(connectionResult.f1157o, 12);
        aVar.m0(connectionResult.f1158p, 13);
        aVar.Y(connectionResult.f1159q, 14);
        aVar.Y(connectionResult.f1160r, 15);
        aVar.Y(connectionResult.f1161s, 16);
        aVar.O(connectionResult.f1162t, 17);
        aVar.m0(connectionResult.f1163u, 18);
        aVar.Z(connectionResult.f1164v, 19);
        aVar.d0(connectionResult.f1146d, 2);
        aVar.m0(connectionResult.f1165w, 20);
        aVar.m0(connectionResult.f1166x, 21);
        aVar.m0(connectionResult.f1167y, 23);
        aVar.m0(connectionResult.f1168z, 24);
        aVar.m0(connectionResult.A, 25);
        aVar.Y(connectionResult.B, 26);
        aVar.Y(connectionResult.f1147e, 3);
        aVar.m0(connectionResult.f1149g, 4);
        aVar.b0(connectionResult.f1150h, 5);
        aVar.b0(connectionResult.f1151i, 6);
        aVar.W(connectionResult.f1152j, 7);
        aVar.b0(connectionResult.f1153k, 8);
        aVar.m0(connectionResult.f1154l, 9);
    }
}
