package com.crrepa.band.my.device.localmusic.model;

import android.database.Cursor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class LocalMusicModel {
    public static final String[] AUDIO_TYPE_ARRAY = {MimeTypes.AUDIO_MPEG, MimeTypes.AUDIO_WAV, "audio/x-wav", MimeTypes.AUDIO_FLAC};

    private static void convertSongList(List<SongBean> list, List<String> list2) {
        if (x0.isEmpty(list2) || x0.isEmpty(list)) {
            return;
        }
        for (String str : list2) {
            Iterator<SongBean> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    SongBean next = it.next();
                    if (isSameSong(str, next.getTitle())) {
                        next.setIsSavedToBand(true);
                        break;
                    }
                }
            }
        }
    }

    public static List<SongBean> getLocalSongList() {
        Cursor query = com.moyoung.dafit.module.common.utils.d.get().getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{FileDownloadModel.ID, "title", "artist", "album", "_data", "duration", "_size", "mime_type"}, null, null, "title ASC");
        ArrayList arrayList = new ArrayList();
        if (query == null) {
            return arrayList;
        }
        while (query.moveToNext()) {
            if (supportAudioType(query.getString(query.getColumnIndexOrThrow("mime_type")))) {
                int i8 = query.getInt(query.getColumnIndexOrThrow("duration"));
                if (!unSupportAudioDuration(i8)) {
                    SongBean songBean = new SongBean();
                    songBean.id = query.getInt(query.getColumnIndexOrThrow(FileDownloadModel.ID));
                    songBean.title = query.getString(query.getColumnIndexOrThrow("title"));
                    songBean.artist = query.getString(query.getColumnIndexOrThrow("artist"));
                    songBean.album = query.getString(query.getColumnIndexOrThrow("album"));
                    songBean.filePath = query.getString(query.getColumnIndexOrThrow("_data"));
                    songBean.duration = i8;
                    songBean.size = query.getInt(query.getColumnIndexOrThrow("_size"));
                    Log.d("song.toString()=", songBean.toString());
                    arrayList.add(songBean);
                }
            }
        }
        query.close();
        return arrayList;
    }

    private static String getSearchContent(int i8, SongBean songBean) {
        return i8 != 0 ? i8 != 1 ? i8 != 2 ? "" : songBean.getAlbum() : songBean.getArtist() : songBean.getTitle();
    }

    public static List<SongBean> getSelectedSongList(List<SongBean> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (SongBean songBean : list) {
            if (songBean.isSelected) {
                arrayList.add(songBean);
            }
        }
        return arrayList;
    }

    public static List<SongBean> getSongListByTag(List<SongBean> list, int i8, String str) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (SongBean songBean : list) {
            if (i8 == 1) {
                if (str.equals(songBean.artist)) {
                    arrayList.add(songBean);
                }
            } else if (i8 == 2 && str.equals(songBean.album)) {
                arrayList.add(songBean);
            }
        }
        return arrayList;
    }

    public static boolean isSameSong(String str, String str2) {
        Log.d("isSameSong:", "savedSongName：" + str + "songTitle:" + str2);
        if (str.contains(".")) {
            str = str.split("\\.")[0];
        }
        if (str2.contains(".")) {
            str2 = str2.split("\\.")[0];
        }
        return str.equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$queryAllSongList$3(List list, ObservableEmitter observableEmitter) {
        try {
            List<SongBean> localSongList = getLocalSongList();
            convertSongList(localSongList, list);
            observableEmitter.onNext(localSongList);
            observableEmitter.onComplete();
        } catch (Exception e8) {
            observableEmitter.onError(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$querySelectedSongList$2(List list, ObservableEmitter observableEmitter) {
        try {
            observableEmitter.onNext(getSelectedSongList(list));
            observableEmitter.onComplete();
        } catch (Exception e8) {
            observableEmitter.onError(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$querySongListByTag$1(List list, int i8, String str, ObservableEmitter observableEmitter) {
        try {
            observableEmitter.onNext(getSongListByTag(list, i8, str));
            observableEmitter.onComplete();
        } catch (Exception e8) {
            observableEmitter.onError(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$searchSongList$0(List list, int i8, String str, ObservableEmitter observableEmitter) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                SongBean songBean = (SongBean) it.next();
                if (getSearchContent(i8, songBean).contains(str)) {
                    arrayList.add(songBean);
                }
            }
            observableEmitter.onNext(arrayList);
            observableEmitter.onComplete();
        } catch (Exception e8) {
            observableEmitter.onError(e8);
        }
    }

    public static Observable<List<SongBean>> queryAllSongList(final List<String> list) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.localmusic.model.c
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalMusicModel.lambda$queryAllSongList$3(list, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<List<SongBean>> querySelectedSongList(final List<SongBean> list) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.localmusic.model.d
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalMusicModel.lambda$querySelectedSongList$2(list, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<List<SongBean>> querySongListByTag(final List<SongBean> list, final int i8, final String str) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.localmusic.model.a
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalMusicModel.lambda$querySongListByTag$1(list, i8, str, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<List<SongBean>> searchSongList(final List<SongBean> list, final int i8, final String str) {
        return Observable.create(new ObservableOnSubscribe() { // from class: com.crrepa.band.my.device.localmusic.model.b
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                LocalMusicModel.lambda$searchSongList$0(list, i8, str, observableEmitter);
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public static List<SongTagBean> sortToSongTagList(List<SongBean> list, int i8) {
        SongTagBean songTagBean;
        ArrayList arrayList = new ArrayList();
        for (SongBean songBean : list) {
            String artist = i8 == 1 ? songBean.getArtist() : i8 == 2 ? songBean.getAlbum() : "";
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    songTagBean = null;
                    break;
                }
                songTagBean = (SongTagBean) it.next();
                if (songTagBean.name.equals(artist)) {
                    break;
                }
            }
            if (songTagBean != null) {
                songTagBean.songList.add(songBean);
            } else {
                SongTagBean songTagBean2 = new SongTagBean();
                songTagBean2.tagType = i8;
                songTagBean2.name = artist;
                ArrayList arrayList2 = new ArrayList();
                songTagBean2.songList = arrayList2;
                arrayList2.add(songBean);
                arrayList.add(songTagBean2);
            }
        }
        return arrayList;
    }

    private static boolean supportAudioType(String str) {
        for (String str2 : AUDIO_TYPE_ARRAY) {
            if (TextUtils.equals(str2, str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean unSupportAudioDuration(int i8) {
        return i8 < 5000;
    }
}
