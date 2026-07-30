package com.moyoung.lib.photopicker;

import android.R;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import java.util.List;

/* loaded from: classes4.dex */
public class PhotoPickHelper {

    public enum PickerType {
        MULTIPLE_IMAGE,
        MULTIPLE_VIDEO,
        SINGLE_IMAGE,
        SINGLE_VIDEO
    }

    private static void executePick(AppCompatActivity appCompatActivity, int i8, PickerType pickerType, i iVar) {
        PhotoPickFragment photoPickFragment = new PhotoPickFragment(i8, pickerType, transferCallback(appCompatActivity, iVar));
        View findViewById = appCompatActivity.getWindow().getDecorView().findViewById(R.id.content);
        FragmentTransaction beginTransaction = appCompatActivity.getSupportFragmentManager().beginTransaction();
        beginTransaction.add(findViewById.getId(), photoPickFragment, "photo_picker_fragment");
        beginTransaction.commit();
    }

    public static void pickMultipleImg(AppCompatActivity appCompatActivity, int i8, i iVar) {
        executePick(appCompatActivity, i8, PickerType.MULTIPLE_IMAGE, iVar);
    }

    public static void pickMultipleVideo(AppCompatActivity appCompatActivity, int i8, i iVar) {
        executePick(appCompatActivity, i8, PickerType.MULTIPLE_VIDEO, iVar);
    }

    public static void pickSingleImg(AppCompatActivity appCompatActivity, i iVar) {
        executePick(appCompatActivity, 1, PickerType.SINGLE_IMAGE, iVar);
    }

    public static void pickSingleVideo(AppCompatActivity appCompatActivity, i iVar) {
        executePick(appCompatActivity, 1, PickerType.SINGLE_VIDEO, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removePickerFragment(Fragment fragment, FrameLayout frameLayout) {
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("photo_picker_fragment");
        if (findFragmentByTag != null) {
            FragmentTransaction beginTransaction = childFragmentManager.beginTransaction();
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commit();
        }
        if (frameLayout == null || frameLayout.getParent() == null) {
            return;
        }
        ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
    }

    @NonNull
    private static i transferCallback(AppCompatActivity appCompatActivity, i iVar) {
        return new a(iVar, appCompatActivity);
    }

    class a implements i {
        final /* synthetic */ AppCompatActivity val$activity;
        final /* synthetic */ i val$callback;

        a(i iVar, AppCompatActivity appCompatActivity) {
            this.val$callback = iVar;
            this.val$activity = appCompatActivity;
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onCanceled(String str) {
            this.val$callback.onCanceled(str);
            PhotoPickHelper.removePickerFragment(this.val$activity);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(Uri uri) {
            this.val$callback.onPicked(uri);
            PhotoPickHelper.removePickerFragment(this.val$activity);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void unSupportGalleryMultiplePick() {
            this.val$callback.unSupportGalleryMultiplePick();
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(List<Uri> list, boolean z7) {
            this.val$callback.onPicked(list, z7);
            PhotoPickHelper.removePickerFragment(this.val$activity);
        }
    }

    class b implements i {
        final /* synthetic */ i val$callback;
        final /* synthetic */ FrameLayout val$container;
        final /* synthetic */ Fragment val$parentFragment;

        b(i iVar, Fragment fragment, FrameLayout frameLayout) {
            this.val$callback = iVar;
            this.val$parentFragment = fragment;
            this.val$container = frameLayout;
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onCanceled(String str) {
            this.val$callback.onCanceled(str);
            PhotoPickHelper.removePickerFragment(this.val$parentFragment, this.val$container);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(Uri uri) {
            this.val$callback.onPicked(uri);
            PhotoPickHelper.removePickerFragment(this.val$parentFragment, this.val$container);
        }

        @Override // com.moyoung.lib.photopicker.i
        public void unSupportGalleryMultiplePick() {
            this.val$callback.unSupportGalleryMultiplePick();
        }

        @Override // com.moyoung.lib.photopicker.i
        public void onPicked(List<Uri> list, boolean z7) {
            this.val$callback.onPicked(list, z7);
            PhotoPickHelper.removePickerFragment(this.val$parentFragment, this.val$container);
        }
    }

    public static void pickMultipleImg(Fragment fragment, int i8, i iVar) {
        executePick(fragment, i8, PickerType.MULTIPLE_IMAGE, iVar);
    }

    public static void pickMultipleVideo(Fragment fragment, int i8, i iVar) {
        executePick(fragment, i8, PickerType.MULTIPLE_VIDEO, iVar);
    }

    public static void pickSingleImg(Fragment fragment, i iVar) {
        executePick(fragment, 1, PickerType.SINGLE_IMAGE, iVar);
    }

    public static void pickSingleVideo(Fragment fragment, i iVar) {
        executePick(fragment, 1, PickerType.SINGLE_VIDEO, iVar);
    }

    @NonNull
    private static i transferCallback(Fragment fragment, i iVar, FrameLayout frameLayout) {
        return new b(iVar, fragment, frameLayout);
    }

    private static void executePick(Fragment fragment, int i8, PickerType pickerType, i iVar) {
        FrameLayout frameLayout = new FrameLayout(fragment.requireContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        ((ViewGroup) fragment.requireView()).addView(frameLayout);
        PhotoPickFragment photoPickFragment = new PhotoPickFragment(i8, pickerType, transferCallback(fragment, iVar, frameLayout));
        FragmentTransaction beginTransaction = fragment.getChildFragmentManager().beginTransaction();
        beginTransaction.add(frameLayout.getId(), photoPickFragment, "photo_picker_fragment");
        beginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void removePickerFragment(AppCompatActivity appCompatActivity) {
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("photo_picker_fragment");
        if (findFragmentByTag != null) {
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.remove(findFragmentByTag);
            beginTransaction.commit();
        }
    }
}
