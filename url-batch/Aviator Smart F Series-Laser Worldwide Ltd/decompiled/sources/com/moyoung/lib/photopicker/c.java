package com.moyoung.lib.photopicker;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class c implements d {
    private static final String PREFS_NAME = "GalleryPhotoPickerPrefs";
    private static boolean isGetContentAction = false;
    private static boolean supportGalleryMultiplePick = true;
    private i callback;
    private final Context context;
    private final ActivityResultLauncher<Intent> getMultipleContents;
    private final ActivityResultLauncher<Intent> getSingleContent;
    private final int maxSelectCount;

    public c(Fragment fragment, int i8) {
        this.context = fragment.requireContext();
        this.maxSelectCount = i8;
        loadSupportGalleryMultiplePick();
        this.getSingleContent = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moyoung.lib.photopicker.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                c.this.handleOnPicked((ActivityResult) obj);
            }
        });
        this.getMultipleContents = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: com.moyoung.lib.photopicker.b
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                c.this.handleOnMultiplePicked((ActivityResult) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnMultiplePicked(ActivityResult activityResult) {
        if (activityResult.getData() == null || activityResult.getResultCode() != -1) {
            i iVar = this.callback;
            if (iVar != null) {
                iVar.onCanceled("result.getData() == null");
                return;
            }
            return;
        }
        Log.d("PhotoPicker", "Selected multiple media");
        ClipData clipData = activityResult.getData().getClipData();
        boolean z7 = false;
        if (clipData == null) {
            if (!isGetContentAction || activityResult.getData() == null) {
                if (this.callback != null) {
                    supportGalleryMultiplePick = false;
                    saveSupportGalleryMultiplePick(false);
                    this.callback.unSupportGalleryMultiplePick();
                    return;
                }
                return;
            }
            Uri data = activityResult.getData().getData();
            ArrayList arrayList = new ArrayList();
            arrayList.add(data);
            i iVar2 = this.callback;
            if (iVar2 != null) {
                iVar2.onPicked(arrayList, false);
                return;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        while (true) {
            if (i8 >= clipData.getItemCount()) {
                break;
            }
            if (arrayList2.size() >= this.maxSelectCount) {
                z7 = true;
                break;
            } else {
                arrayList2.add(clipData.getItemAt(i8).getUri());
                i8++;
            }
        }
        if (arrayList2.isEmpty()) {
            i iVar3 = this.callback;
            if (iVar3 != null) {
                iVar3.onCanceled("uriList.isEmpty()");
            }
            Log.d("GalleryPhotoPicker", "No media selected");
            return;
        }
        i iVar4 = this.callback;
        if (iVar4 != null) {
            iVar4.onPicked(arrayList2, z7);
        }
        Log.d("GalleryPhotoPicker", "Number of items selected: " + arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleOnPicked(ActivityResult activityResult) {
        if (activityResult.getData() == null || activityResult.getResultCode() != -1) {
            i iVar = this.callback;
            if (iVar != null) {
                iVar.onCanceled("result.getData() == null || result.getResultCode() != RESULT_OK");
            }
            Log.d("PhotoPicker", "handleOnPicked: " + activityResult);
            return;
        }
        Uri data = activityResult.getData().getData();
        i iVar2 = this.callback;
        if (iVar2 != null) {
            iVar2.onPicked(data);
        }
        Log.d("PhotoPicker", "Selected URI: " + data);
    }

    private boolean isSupportedMediaType(Intent intent) {
        return intent.resolveActivity(this.context.getPackageManager()) != null;
    }

    private void loadSupportGalleryMultiplePick() {
        supportGalleryMultiplePick = this.context.getSharedPreferences(PREFS_NAME, 0).getBoolean("supportGalleryMultiplePick", true);
    }

    private void pickMultipleWithMediaType(Uri uri, String str) {
        if (this.getMultipleContents == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK", uri);
        if (!str.isEmpty()) {
            intent.setDataAndType(uri, str);
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (isSupportedMediaType(intent) && supportGalleryMultiplePick) {
            Log.d("GalleryPhotoPicker", "pickMultipleWithMediaType: " + intent);
            this.getMultipleContents.launch(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.setType(str);
        intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (isSupportedMediaType(intent2)) {
            Log.d("GalleryPhotoPicker", "pickMultipleWithMediaType: " + intent2);
            isGetContentAction = true;
            this.getMultipleContents.launch(intent2);
            return;
        }
        Log.d("GalleryPhotoPicker", "isSupportedMediaType: false," + intent2);
        i iVar = this.callback;
        if (iVar != null) {
            iVar.onCanceled("Unsupported media type");
        }
    }

    private void pickSingleWithMediaType(Uri uri, String str) {
        if (this.getSingleContent == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.PICK", uri);
        if (!str.isEmpty()) {
            intent.setDataAndType(uri, str);
        }
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        if (isSupportedMediaType(intent)) {
            Log.d("GalleryPhotoPicker", "pickSingleWithMediaType: " + intent);
            this.getSingleContent.launch(intent);
            return;
        }
        Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
        intent2.setType(str);
        intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", false);
        if (isSupportedMediaType(intent2)) {
            Log.d("GalleryPhotoPicker", "pickSingleWithMediaType: " + intent2);
            this.getSingleContent.launch(intent2);
            return;
        }
        Log.d("GalleryPhotoPicker", "isSupportedMediaType: false," + intent2);
        i iVar = this.callback;
        if (iVar != null) {
            iVar.onCanceled("Unsupported media type");
        }
    }

    private void saveSupportGalleryMultiplePick(boolean z7) {
        SharedPreferences.Editor edit = this.context.getSharedPreferences(PREFS_NAME, 0).edit();
        edit.putBoolean("supportGalleryMultiplePick", z7);
        edit.apply();
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleImage() {
        pickMultipleWithMediaType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, com.crrepa.x.a.f13978d);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleImageAndVideo() {
        pickMultipleWithMediaType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "");
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickMultipleVideo() {
        pickMultipleWithMediaType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, com.crrepa.x.a.f13980f);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleImage() {
        pickSingleWithMediaType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, com.crrepa.x.a.f13978d);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleImageAndVideo() {
        pickSingleWithMediaType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "");
    }

    @Override // com.moyoung.lib.photopicker.d
    public void pickSingleVideo() {
        pickSingleWithMediaType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, com.crrepa.x.a.f13980f);
    }

    @Override // com.moyoung.lib.photopicker.d
    public void setCallback(i iVar) {
        this.callback = iVar;
    }
}
